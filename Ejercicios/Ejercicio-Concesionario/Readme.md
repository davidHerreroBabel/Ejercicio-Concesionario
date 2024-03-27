He aplicado el principio de Liskov en las clases tanto de tipo Pieza como Coche.

El principio de abierto/cerrado lo he aplicado tanto en los controladores, como en los servicios.

El principio de responsabilidad única lo estaba intentado aplicar ahora a los services i repositories ya que me he dado cuenta que tanto coche como taller usaban la clase CocheRepository pero no me ha dado tiempo a modificarlo ni crear el Servicio y controlador de Pieza.

Considero que he utilizado correctamente el principio de segregación a excepción de con los Utils ya que era más practica poder llamar desde CocheController también. A lo mejor debería hacer un InfoPrinter para Coche y otro para Concesionario.

También considero que he aplicado el principio de dependencia invertida en todo el código.

