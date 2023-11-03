package co.edu.uniquindio.poo;

public class Persona {
  
        private final String nombre;
        private final String apellido;
        private final String email;
        private final String celular;
    
        public Persona(String nombre,String apellido,String email, String celular){
                       
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.celular = celular;
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public String getApellido() {
            return apellido;
        }
    
        public String getEmail() {
            return email;
        }
    
        public String getCelular() {
            return celular;
        }
    }
