package clases;

public class Contraseņa{
	private String idUsuario;
	private String clave;
	
	public Contraseņa(String idUsuario,String clave)
    {
		this.idUsuario = 	idUsuario;
		this.clave = clave;
		
	}	
	public String getIdUsuario()
	{
		return idUsuario;
	}
	public String getClave()
	{
		return clave;
	}
	public void setIdUsuario(String idUsuario)
	{
		this.idUsuario = idUsuario;
	}
	public void setClave(String clave)
	{
		this.clave = clave;
	}

	
}
