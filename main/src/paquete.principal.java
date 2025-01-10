package princpal;

public class LogLevels {
/*Este método recibe un string de tipo [LEVEL]:message, lo que hace es borrar el nivel y mostrar solo el mensaje*/

    public static String message(String logLine) {
        //se hace una matriz de dos string, separando el nivel del mensaje
        String[] partes = logLine.split(": ", 2);//controla: formato cadena.
        /*si no puede dividir en dos por falta de ":"(no cumple formato) retorna vacio*/
        if (partes.length < 2) {
            return "";
        }

        String nivel = partes[0].trim();
        String mensaje = partes[1].trim();
        if (!nivel.equals("[WARNING]") && !nivel.equals("[INFO]") && !nivel.equals("[ERROR]")) {
            return "";
        }

        return mensaje;
    }


    public static String logLevel(String logLine) {
        String[] partes = logLine.split(": ", 2);
        if(partes.length<2){
            return "";
        }
        String mensaje= partes[0].trim();
        if(!mensaje.equals("[ERROR]" )&& !mensaje.equals("[WARNING]") && !mensaje.equals("[INFO]")){
            return "";
        }
        char[] arr = new char[10];
        for(int i=0 ; i<mensaje.length() ; i++){
            char letra = mensaje.charAt(i);
            if(letra != '[' && letra !=']'){
                arr[i]=letra;
            }
        }
        String string= String.valueOf(arr).trim();
        String resultado= string.toLowerCase();
        return resultado;
    }

    public static String reformat(String logLine) {
        return "[INFO]Operacion completa";
    }
}