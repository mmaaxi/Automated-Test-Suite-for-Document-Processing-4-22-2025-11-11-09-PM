Feature: Validar subida de archivo con formato válido y vista previa

  Scenario: Subir archivo en formato PDF/DOCX dentro del límite de 50 MB
    Given El usuario está en la página de subida de archivos
    When El usuario selecciona un archivo con formato válido PDF/DOCX y tamaño dentro del límite
    Then El archivo se carga con éxito
    And Se muestra la vista previa del archivo con nombre, tamaño y tipo