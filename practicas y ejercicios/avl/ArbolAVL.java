//package Arboles;
public class ArbolAVL
{
	
	//Atributos
	Nodo nuevo, raiz, temp, temp2;
	int altura=0; int altura2=0;
	public ArbolAVL()
	{
		nuevo = null;
		raiz = null;
	}
	//Constructor Vac�o lo utilizo porque necesito inicializar mis variables despu�s
	
	//Metodo de Alta de Nodos, se encarga de dar de alta los nuevos datos que ingrese el usuario
	public void alta(int dato) //Se le envia un dato entero 
	{
		if(raiz==null)					//Verificamos si no existe aun un arbol
		{
			raiz=new Nodo();
			raiz.dato=dato;
			raiz.drcha=null;
			raiz.izqda=null;
			raiz.padre=null;
			raiz.balance=0;
		}
		else						//Caso contrario si ya existe
		{
			temp=raiz;
			while(temp!=null)
			{
			//si el dato es mayor y hay espacio
			if((dato>temp.dato)&&(temp.drcha==null))	
			{
				nuevo=new Nodo();
				nuevo.dato=dato;
				nuevo.izqda=null;
				nuevo.drcha=null;
				temp.drcha=nuevo;
				nuevo.padre=temp;
				nuevo.balance=0;
				balanceAlta(nuevo.padre,1);
				break;
			}
			//si el dato es menor y hay espacio
			else if ((dato<temp.dato)&&(temp.izqda==null))	
			{
				nuevo=new Nodo();
				nuevo.dato=dato;
				nuevo.izqda=null;
				nuevo.drcha=null;
				temp.izqda=nuevo;
				nuevo.padre=temp;
				nuevo.balance=0;
				balanceAlta(nuevo.padre,-1);
				break;
			}
			//si el dato es igual a otro ya agregado
			else if (dato==temp.dato)
			{
				//Ya existe ese dato en el arbol
				break;
			}
				
			//si hay mas datos  a la derecha
			else if(dato>temp.dato)
				temp=temp.drcha;
			//si hay mas datos  a la izquierda
			else
				temp=temp.izqda;
			}
		}
	}//end alta

	public void balanceAlta(Nodo nodo, int incremento)
	{	
		int tipo=-1;
		while(nodo!=null)
		{
			nodo.balance=nodo.balance+incremento; //Reajusta balances
			if(nodo.balance==0) //Si es igual a 0 se detiene
				break;
			else
			{
				tipo=tipoRotacion(nodo); //llamamos al metodo tipoRotacion
				if(tipo==0) //No hay necesidad de rotar
				{
					if(nodo.padre!=null)
					{
						if(nodo.dato<nodo.padre.dato)
						{
							incremento=-1;
						}
						else
						{
							incremento=1;
						}
					}
					nodo=nodo.padre;
				}
				if(tipo==1)	//Rotacion sencilla izquierda
					{		
						rotacionSI(nodo,nodo.drcha);
						break;
					}
				if(tipo==2) //Rotacion doble derecha-izquierda
					{
						rotacionSD(nodo.drcha,nodo.drcha.izqda);
						rotacionSI(nodo,nodo.drcha);
						break;
					}
				if(tipo==3) //Rotacion sencilla derecha
					{
						rotacionSD(nodo,nodo.izqda);


						break;
					}
				if(tipo==4) //Rotacion doble izquierda-derecha
					{
					rotacionSI(nodo.izqda,nodo.izqda.drcha);
					rotacionSD(nodo,nodo.izqda);
					
						break;
					}
			
			}
			
			
		}
	}

	
	public int tipoRotacion(Nodo pr)
	{
		if(pr.balance==2)		//Positivo
		{
			if((pr.drcha.balance==0)||(pr.drcha.balance==1))
				return 1;
			else if(pr.drcha.balance==-1)
				return 2;
		}
		else if(pr.balance==-2)		//Negativo
		{
			if((pr.izqda.balance==0)||(pr.izqda.balance==-1))
				return 3;
			else if(pr.izqda.balance==1)
				return 4;
		}
		return 0;
	}
	
//	El metodo rotacionSI se encarga de realizar la rotacion Sencilla a la izquierda
//	recibe como datos el nodo del problema y su hijo derecho
		
		public void rotacionSI(Nodo pr, Nodo hijo_der)
		{		
			int w, balt;
			temp=hijo_der.izqda;
			if(pr==raiz)
			{
				raiz=hijo_der;
				hijo_der.padre=null;
			}
			else
			{
				if(pr.dato>pr.padre.dato)
				{
					pr.padre.drcha=hijo_der;
				}
				else
				{
					pr.padre.izqda=hijo_der;
				}
				hijo_der.padre=pr.padre;
			}
			hijo_der.izqda=pr;
			pr.drcha=temp;
			pr.padre=hijo_der;
			if(temp!=null)
			{
				temp.padre=pr;
			}
			w=pr.balance;
			pr.balance=(w-1)-Math.max(hijo_der.balance,0);
			balt=Math.min((w-2),(w+hijo_der.balance-2));
			hijo_der.balance=Math.min(balt,(hijo_der.balance-1));
			
		}

//	El metodo rotacionSD se encarga de realizar la rotacion Sencilla a la derecha
//	recibe como datos el nodo del problema y su hijo izquierdo
		
		public void rotacionSD(Nodo pr, Nodo hijo_izq)
		{
			
			int w, balt;
			temp=hijo_izq.drcha;
			if(pr==raiz)
			{
				raiz=hijo_izq;
				hijo_izq.padre=null;
			}
			else
			{
				if(pr.dato>pr.padre.dato)
				{
					pr.padre.drcha=hijo_izq;
				}
				else
				{
					pr.padre.izqda=hijo_izq;
				}
			}
				hijo_izq.padre=pr.padre;
				hijo_izq.drcha=pr;
				pr.izqda=temp;
				pr.padre=hijo_izq;
				if(temp!=null)
				{
					temp.padre=pr;
				}
				w=pr.balance;
				pr.balance=(w+1)-Math.min(hijo_izq.balance,0);
				balt=Math.min((w+2),(w-hijo_izq.balance+2));
				hijo_izq.balance=Math.max(balt,(hijo_izq.balance+1));
			
		}
	public void eliminarelemento(int elemento)
	{

		if(raiz!=null)
		{
			temp = raiz;
			if(temp.dato ==elemento)
			{

				raiz = repla(raiz);
	
			}
			else
			{
				Nodo actual, par = raiz;
				boolean foun = false;
				if(elemento < temp.dato)
					actual = raiz.izqda;
				else
					actual = raiz.drcha;
				while(actual != null && !foun)
				{
					if(elemento==actual.dato)
					{
						foun = true;

						if(actual ==par.izqda)
						{
							par.izqda = repla(actual);
						}
						else
						{
							par.drcha = repla(actual);
						}
					}
					else
					{
						par = actual;
						if(elemento < actual.dato)
							actual = actual.izqda;
						else
							actual = actual.drcha;
					}
					
				}
				if(!foun)
					System.out.println("Elemento no encontrado");
			}

		}
	}
	public Nodo repla (Nodo nu)
	{
		Nodo result = null;
		if ((nu.izqda ==null)&& (nu.drcha == null))
			result = null;
		else if ((nu.izqda!=null)&& (nu.drcha==null))
			result = nu.izqda;
		else if ((nu.izqda ==null)&& (nu.drcha != null))
			result = nu.drcha;
		else
		{
			Nodo actual = nu.drcha;
			Nodo pa = nu;
			while (actual.izqda != null)
			{
				pa = actual;
				actual = actual.izqda;
			}
			if(nu.drcha==actual)
				actual.izqda = nu.izqda;
			else
			{
				pa.izqda= actual.drcha;
				actual.drcha = nu.drcha;
				actual.izqda = nu.izqda;
			}
			result = actual;
		}
		return result;
	}
	
	public void eliminaArbol()
	{
		if(raiz != null)
			eliminArbol(raiz);
	}
	private void eliminArbol(Nodo raiz)
	{
		if(raiz != null)
		{
			eliminArbol(raiz.izqda);
			eliminArbol(raiz.drcha);
			raiz = null;
		}
	}
	public boolean buscar(int buscado)
	{
		if (raiz != null)
			return (raiz.buscarNodo(buscado)!= null);
		else
			return false;
	}

	public void visualizar()
	{
		if (raiz != null)
		{
			
			System.out.println("Elementos del arbol: recorrido En orden\n");
			raiz.re_enorden();
			System.out.println("\nElementos del arbol: recorrido Preorden\n");
			raiz.re_preorden();
			System.out.println("\nElementos del arbol: recorrido Postorden\n");
			raiz.re_postorden();
			
		}
	}
}