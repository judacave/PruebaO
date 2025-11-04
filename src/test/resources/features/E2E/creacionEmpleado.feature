Feature: Creación de un nuevo empleado en el sistema OrangeHRM
  Como administrador del sistema
  Quiero registrar nuevos empleados
  Para mantener actualizada la información de empleados

  Background:
    Given que el usuario administrador ha iniciado sesion en OrangeHRM

  @E2E
  Scenario: Crear un nuevo empleado exitosamente
    When el administrador navega al modulo de PIM
    And selecciona la opcion para agregar un nuevo empleado
    And diligencia la informacion del empleado:
      | primerNombre | Eutimio |
      | apellido     | Velez   |
    And agrega la foto de perfil
    And realiza una busqueda por filtro de nombre en Directory
    Then el empleado deberia aparecer en la lista de empleados
