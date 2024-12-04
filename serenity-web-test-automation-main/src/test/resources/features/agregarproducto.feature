Feature: Agregar producto al carrito

  @AgregarCarrito @HappyPath
  Scenario Outline: Seleccionar un producto y agregarlo al carrito
    Given el usuario ha iniciado sesión usando su usuario "<user>" y clave "<password>"
    When selecciona el producto de nombre "<name_product>" para agregar al carrito
    Then el producto se agrega al carrito de manera exitosa

    Examples:
      | user           | password        | name_product       |
      | testOmarUser1  | testOmarPass1   | Samsung galaxy s6  |
      | testOmarUser2  | testOmarPass2   | Nokia lumia 1520   |
