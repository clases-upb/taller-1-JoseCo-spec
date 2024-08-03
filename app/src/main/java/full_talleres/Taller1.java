/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
        public static void main(String[] args) {

        }
    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
        public static String Convertir_km_seg(int velocidad) {
            try {
                float mt_s = 0;
                float mt_h = 0;
                final float metros = 1000f, horas = (float) 1 / 3600;
                mt_s = velocidad * metros;
                mt_h = mt_s / horas;
                String total = mt_s + " m/s - " + mt_h + " m/h";
                return total;
            } catch (Exception e) {
                return "Error en la conversión";
            }
        }
    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */
    
        public static float Convertir_cm_lt(double cc) {
            try {
                // Conversión: 1 litro = 1000 centímetros cúbicos
                float litros = (float) (cc / 1000.0);
                return litros;
            } catch (ArithmeticException e) {
                System.err.println("Error al convertir. Retorna 0.");
                return 0f;
            }
        }

    /*4.Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
        public static int Convertir_us_cops(int dolares) { 
            try {
                int trm = 4170; // Tasa de cambio TRM (pesos por dólar)
                return dolares * trm;
            } catch (ArithmeticException e) {
                // Manejo de errores (si la tasa de cambio es 0 o hay otro problema)
                return -1;
            }
        }
        
    /*5.Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
        public static double Convertir_cent_far(double centigrados) {
            try {
                double fahrenheit = 32 + (9 * centigrados / 5);
                return fahrenheit;
            } catch (Exception e) {
                // Si ocurre algún error, retornamos 0
                return 0;
            }
        }
    /*6.Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
        public static int Calcular_segs(int dias, int horas, int minutos, int segundos) {
            try {
                // Validamos que los valores sean positivos
                if (dias < 0 || horas < 0 || minutos < 0 || segundos < 0) {
                    return -1; // Si hay algún valor negativo, retornamos -1
                }

                int totalSegundos = segundos + (minutos * 60) + (horas * 3600) + (dias * 86400);
                return totalSegundos;
            } catch (Exception e) {
                return -1; // Si ocurre algún error, retornamos -1
            }
        }
    /*7.Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/

        public static float Calcular_peso_carga(float pesoTotalCamion, float pesoCamionVacio) {
            try {
                // Validamos que los valores sean positivos
                if (pesoTotalCamion < 0 || pesoCamionVacio < 0) {
                    return -1; // Indicador de error
                }

                float pesoNetoKilos = pesoTotalCamion - pesoCamionVacio;
                float pesoNetoToneladas = pesoNetoKilos / 1000;

                return pesoNetoToneladas;
            } catch (Exception e) {
                return -1; // Indicador de error
            }
        }
    /*8.Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */
        public static float Calcular_horasxviaje(String destino, short distanciaKms, short velocidadPromedio) {
            try {
                // Calculamos el tiempo en horas usando la fórmula: tiempo = distancia / velocidad
                float tiempoHoras = (float) distanciaKms / velocidadPromedio;
                return tiempoHoras;
            } catch (Exception e) {
                // Si ocurre algún error (por ejemplo, destino no encontrado), devolvemos -1.
                return -1;
            }
        }
    /*9.Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/
        public static float Calcular_combustible(int ruta1, int ruta2, int ruta3, int ruta4) {
            try {
                // Consumo de combustible en despegue y aterrizaje
                float despegue = 1.2f;
                float aterrizaje = 0.4f;

                float consumoPorTonelada = 60.8f / 0.2f;

                float consumoRuta1 = (ruta1 * consumoPorTonelada) + despegue + aterrizaje;
                float consumoRuta2 = (ruta2 * consumoPorTonelada) + despegue + aterrizaje;
                float consumoRuta3 = (ruta3 * consumoPorTonelada) + despegue + aterrizaje;
                float consumoRuta4 = (ruta4 * consumoPorTonelada) + despegue + aterrizaje;

                // Calcular el consumo total
                float consumoTotal = consumoRuta1 + consumoRuta2 + consumoRuta3 + consumoRuta4;

                return consumoTotal;
            } catch (Exception e) {
                // Manejo de errores: devolver -1 en caso de error
                return -1;
            }
        }
    /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
        public static double Calcular_peso_luna(byte pesoEnTierra) {
            try {
                // Gravedad en la Tierra
                double gravedadTierra = 9.81;

                double pesoTierraNewtons = pesoEnTierra * gravedadTierra;

                double factorLuna = 0.165;

                double pesoLunaNewtons = pesoTierraNewtons * factorLuna;

                return pesoLunaNewtons;
            } catch (Exception e) {
                // Manejo de errores: devolver 0 en caso de error
                return 0;
            }
        }
}
