Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given el usuario ha iniciado sesión en el sistema
    When el usuario sube los documentos requeridos
    And el usuario inicia el procesamiento de los documentos
    Then el sistema genera el 'Slip de salida'
    And el sistema guarda los documentos originales y datos extraídos en el historial de la solicitud