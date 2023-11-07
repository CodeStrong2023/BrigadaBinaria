@startuml Persona

class Persona {
    - nombre: String 
    - genero: char
    - edad: int
    - direccion: String

    + getNombre(): String
    + setNombre(String): void
    + getGenero(): char
    + setGenero(char): void
    + getEdad(): int
    + setEdad(int): void
    + getDireccion(): String
    + setDireccion(String): void
}
class Empleado {
    - idEmpleado: int
    - sueldo: double

    + getIdEmpleado(): int
    + getSueldo(): double
    + setSueldo(double): void
}
class Cliente {
    - idCliente: int
    - fechaRegistro: Date
    - vip: boolean

    + getIdCliente(): int
    + getFechaRegistro(): Date
    + setFechaRegistro(Date): void
    + idVip(): boolean
    + setVip(booelan): void
}
Persona <|-- Empleado
Persona <|-- Cliente

@enduml
   

