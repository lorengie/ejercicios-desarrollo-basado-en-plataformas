import java.util.Scanner
/*
* Desarrollar un software que permita escoger el representante del municipio “Premier”. Para tal cargo se han postulado tres candidatos, los cuales han realizado una intensa campaña publicitaria utilizando los principales medios de comunicación (Internet, radio, y televisión). Se desea conocer el costo de la campaña calculando el retorno de la inversión realizada en publicidad. Para esto, se determinaron los siguientes valores dependiendo del medio que influenció al votante:


•	Voto influenciado por publicidad en Internet: $700000
•	Voto influenciado por publicidad en radio: $200000
•	Voto influenciado por publicidad en televisión: $600000

Lo anterior quiere decir que, por cada voto que reciba un candidato influenciado por publicidad en Internet, su costo de campaña se incrementara en $700000, del mismo modo por cada voto influenciado por publicidad en radio, su costo de campaña se incrementara en $200000, y finalmente, por cada voto influenciado por publicidad en televisión, su costo de campaña se incrementar en $600000.

Las elecciones para representante del municipio “Premier” requieren una aplicación que les permita:
1.	Votar por el candidato de su elección.
2.	Calcular el costo de campaña de un candidato dependiendo de la influencia publicitaria de cada voto.
3.	Vaciar todas las urnas de la votación.
4.	Conocer el número total de votos.
5.	Porcentaje de votos obtenidos por cada candidato.
6.	Costo promedio de campaña en las elecciones.
* */

fun main() {
    val scanner = Scanner(System.`in`)
    var candidato1=0
    var candidato2=0
    var candidato3=0

    var costoCandidato1=0
    var costoCandidato2=0
    var costoCandidato3=0

    val internet = 7000000
    val radio = 200000
    val tv= 600000
    var totalVotos=0
    var opcion:Int

    do{
        println("""""
            |Bienvenido al menu de elecciones a continuacion elija una opcion para seguir
            |1 votar por un candidato
            |2 calcular el valor del costo de campaña de un candidato
            |3 vaciar urnas 
            |4 mostrar votos 
            |5 mostrar porcentaje de votos 
            |6 mostrar costo promedio de la campaña 
            |7 salir 
      
        """.trimMargin())
        opcion= scanner.nextInt()
        when(opcion){
            1->{
                println(""""
                    |ingrese el numero del candidato por el que va a votar
                    |1 candidato 1
                    |2 candidato 2
                    |3 candidato 3 """.trimMargin())
                val candidato= scanner.nextInt()
                println("""""
                    |ingrese el medio de publicidad por el cual conoció al candidato
                    |1 internet
                    |2 radio
                    |3 TV
                    |""".trimMargin())
                val medio= scanner.nextInt()
                println("Su voto se ha registrado, gracias por votar")
                var costo =0
                if(medio==1){
                    costo= internet
                }
                else if (medio==2){
                    costo= radio
                }
                else if(medio==3){
                    costo=tv
                }
                if (candidato ==1){
                    candidato1++
                    totalVotos++
                    costoCandidato1 +=costo
                }
                else if (candidato==2){
                    candidato2++
                    totalVotos++
                    costoCandidato2 +=costo
                }
                else if (candidato==3){
                    candidato3++
                    totalVotos++
                    costoCandidato3 +=costo
                }
                else{
                    println("Candidato invalido")
                }


            }
            2-> {
                println("""""ingrese el numero del candidato 
                    |1
                    |2
                    |3
                   
                """.trimMargin())
                val candidato= scanner.nextInt()
                var costo=0
                if(candidato==1){
                    costo=costoCandidato1
                }
                else if (candidato==2){
                    costo=costoCandidato2
                }
                else if(candidato==3){
                    costo=costoCandidato3
                }
                else println("opcion invalida")
                if(candidato in 1..3) {
                    println("el costo de la campaña del candidato $candidato : es de $costo")
                }
            }
            3->{
                candidato1=0
                candidato2=0
                candidato3=0
                costoCandidato1=0
                costoCandidato2=0
                costoCandidato3=0
                totalVotos=0
                println("Se han vaciado las urnas con exito ")
            }
            4-> println("El total de votos es de: $totalVotos")
            5-> {
                println("El porcentaje de votos: ")
                if(totalVotos>0){
                    var can1=(candidato1*100)/totalVotos
                    var can2=(candidato2*100)/totalVotos
                    var can3=(candidato3*100)/totalVotos
                    println("""
                        |El porcentaje de candidato 1 es $can1 %
                        |El porcentaje de candidato 2 es $can2 %
                        |El porcentaje de candidato 3 es $can3 %
                    """.trimMargin())
                }
                else println("Aun no hay votos")
            }
            6->{

                if(totalVotos>0) {
                    var campania = (costoCandidato1 + costoCandidato2 + costoCandidato3) / totalVotos
                    println("El costo promedio de la campaña es: $campania")
                }
                else println("aun no hay votos")
            }
            7-> println("Saliendo del progrma")

            else-> println("ingrese una opcion valida ")
        }

    } while(opcion !=7)
}