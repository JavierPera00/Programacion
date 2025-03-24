package Trimestre3;

public class Temario {
/*
 Mapa guarda de dos en dos (clave y valor).
 Clave:Es única.(Es lo más importante).
 Valor: Si puede tener dos valores iguales.
 Si usa una clave que existe la sobre escribe (No pueden haber dos claves iguales).
 No hay orden.
 
 Map <String,Integer> mapa1 = new HashMap<>(); 
  
 mapa1.put("CLAVE",1234567); 
 
 mapa1.get("CLAVE");
 
 mapa1.remove("CLAVE");
 
 MÉTODOS:
 isEmpty();
 clear();
 containsKey(); Si la clave esta --> Devuelve Boolean
 containsValue(); Si el valor esta --> Devuelve Boolean
 
 Borrar de forma alternativa: mapa.put("Clave", null); 
 Como esta nulo seguira existiendo pero no estará asociada a ningun valor.
  
  
 RECORRER MAPAS:
 
1) Set<String> claves = mapa.keySet();
 	for(String key: pares){
 	clave = key
 	Valor = mapa.get(key);
 	}
 2) Collection<Alumno> values = mapa.values(); --> Recorrer para traer los valores, si te pide clave no se usa
   	for(Alumno alumno: values){
 	syso(alumno);
 	}
  Collection<Alumno> values = mapa.values();
  List<Alumno> lista = new ArrayList<>(values);
   for(Alumno alumno: lista){
 	syso(alumno);
 }
 
 3) Set<Entry<String,Alumno>> pares = mpa.entrySet(); --> Saca los entry (son registros --> (es la clave y valor)).
   	for(Entry<String,Alumno>> par : pares){
 	syso("Clave:" + par.getKey());
 	syso("Valor:" + par.getValue());
 	}
 * */
}
