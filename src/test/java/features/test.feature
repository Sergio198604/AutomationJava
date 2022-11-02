Feature: Flujos PVI
  Como usuario quiero realizar diferentes tipos de acciones en el sistema PVI

  Scenario: Ingresar una solicitud
    Given El usuario se encuentra en la pagina de PVI
    When ingresa su usuario
    And ingresa su contraseña
    And presionar Ingresar
    And ingresar en el buscador
    And presionar Buscar
    And presionar Ingreso primera solicitud
    And seleccionar medio de ingreso
    And Agregar primer requerimiento
    And seleccionar recinto
    And seleccionar lugar
    And seleccionar item
    And seleccionar problema
    And descripcion problema
    And seleccionar responsable
    And guardar requerimiento
    And Agregar segundo requerimiento
    And seleccionar segundo recinto
    And seleccionar segundo lugar
    And seleccionar segundo item
    And seleccionar segundo problema
    And descripcion segundo problema
    And guardar segundo requerimiento
    And vista previa
    And enviar solicitud
    And marcar propietarios
    And marcar enviar copia
    And ingresar mail CC
    Then envio solicitud final

    Scenario: diagnostico individual junto con el comprobante digital OI
      Given El usuario se encuentra en la pagina de PVI
      When ingresa su usuario
      And ingresa su contraseña
      And presionar Ingresar
      And orden de inspección
      And requerimientos
      And check Masivo
      And acciones Masivas
      And diagnosticar
      And instruccion uno
      And no corresponde
      And instruccion dos
      And cerrar sin firma
      And cerrar con firma
      And seleccionar no corresponde
      And aceptar
      And cerrar sin firma
      And aceptar
      And diagnosticar req3 no corresponde con firma
      And seleccionar no corresponde
      And aceptar
      And cerrar con firma
      And aceptar
      And diagnosticar req4 no corresponde inspeccionado no corresponde
      And seleccionar no corresponde
      And aceptar
      And inspeccionado no corresponde
      And diagnosticar req5 reinspeccion
      And seleccionar re inspección
      And aceptar
      And diagnosticar req7 visita sin moradores
      And seleccionar visita sin moradores
      And aceptar

