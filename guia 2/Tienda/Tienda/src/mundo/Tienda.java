/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Universidad Ean (Bogot� - Colombia)
 * Programa de Ingenier�a de Sistemas
 * Licenciado bajo el esquema Academic Free License version 2.1
 * <p>
 * Desarrollo de Software - Gu�a 2 - Actividad 2
 * Ejercicio: tienda
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package mundo;

/**
 * Tienda que maneja 4 productos.
 */
public class Tienda {
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Producto 1 de la tienda.
     */
    private Producto producto1;

    /**
     * Producto 2 de la tienda.
     */
    private Producto producto2;

    /**
     * Producto 3 de la tienda.
     */
    private Producto producto3;

    /**
     * Producto 4 de la tienda.
     */
    private Producto producto4;

    /**
     * Dinero total recibido por las ventas.
     */
    private double dineroEnCaja;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea la tienda con sus 4 productos. <br>
     * <b> post: </b> El dinero en caja fue inicializado en 0.<br>
     * Los 4 productos fueron inicializados con los siguientes valores: <br>
     * Producto 1 - Tipo: PAPELERIA, Nombre: L�piz, Valor unitario: 550.0, Cantidad en bodega: 18, Cantidad m�nima: 5, Imagen: lapiz.png. <br>
     * Producto 2 - Tipo: DROGUERIA, Nombre: Aspirina, Valor unitario: 109.5, Cantidad en bodega: 25, Cantidad m�nima: 8, Imagen: aspirina.png. <br>
     * Producto 3 - Tipo: PAPELERIA, Nombre: Borrador, Valor unitario: 207.3, Cantidad en bodega: 30, Cantidad m�nima: 10, Imagen: borrador.png. <br>
     * Producto 4 - Tipo: SUPERMERCADO, Nombre: Pan, Valor unitario: 150.0, Cantidad en bodega: 15, Cantidad m�nima: 20, Imagen: pan.png. <br>
     */
    public Tienda() {
        producto1 = new Producto("papeleria", "Lapiz", 550.0, 18, 5, "lapiz.png");
        producto2 = new Producto("drogueria", "Aspirina", 109.5, 25, 8, "aspirina.png");
        producto3 = new Producto("papeleria", "Borrador", 207.3, 30, 10, "borrador.png");
        producto4 = new Producto("supermercado", "Pan", 150.0, 15, 20, "pan.png");
        dineroEnCaja = 0;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Retorna el producto 1.
     *
     * @return Producto 1 de la tienda.
     */
    public Producto darPrimerProducto() {
        return producto1;
    }

    /**
     * Retorna el producto 2.
     *
     * @return Producto 2 de la tienda.
     */
    public Producto darSegundoProducto() {
        return producto2;
    }

    /**
     * Retorna el producto 3.
     *
     * @return Producto 3 de la tienda.
     */
    public Producto darTercerProducto() {
        return producto3;
    }

    /**
     * Retorna el producto 4.
     *
     * @return Producto 4 de la tienda.
     */
    public Producto darCuartoProducto() {
        return producto4;
    }

    /**
     * Retorna el dinero en caja.
     *
     * @return Dinero en caja.
     */
    public double darDineroEnCaja() {
        return dineroEnCaja;
    }

    /**
     * Retorna el producto con el nombre dado por par�metro.
     *
     * @param pNombre Nombre del producto buscado. pNombre != null && pNombre != "".
     * @return Producto con el nombre dado por par�metro, null si no lo encuentra.
     */
    public Producto darProducto(String pNombre) {
        // TODO: Buscar el producto con el nombre dado.
        // Producto buscado = null;
        if (pNombre != null && pNombre != ""){
            if (producto1.darNombre().equalsIgnoreCase(pNombre)){
                return producto1;
            }else if (producto2.darNombre().equalsIgnoreCase(pNombre)){
                return producto2;
            }else if (producto3.darNombre().equalsIgnoreCase(pNombre)){
                return producto3;
            }else if (producto4.darNombre().equalsIgnoreCase(pNombre)){
                return producto4;
            }
        }
        return null;
    }

    /**
     * Retorna el promedio de las ventas.
     *
     * @return Dinero promedio obtenido por unidad de producto vendida.
     */
    public double darPromedioVentas() {
        double respuesta = 0.0;
        // TODO: Obtener y retornar el promedio de las ventas.
        respuesta = producto1.darCantidadUnidadesVendidas() + producto2.darCantidadUnidadesVendidas() + producto3.darCantidadUnidadesVendidas() + producto4.darCantidadUnidadesVendidas();
        if (respuesta==0){
            return 0.0;
        }
        double eldinero=dineroEnCaja;
        return eldinero/respuesta;
    }

    /**
     * Retorna el producto con m�s unidades vendidas.
     *
     * @return Producto con m�s unidades vendidas. Null si ning�n producto tiene unidades vendidas.
     */
    public Producto darProductoMasVendido() {
        // TODO: Obtener y retornar el nombre del producto m�s vendido
        Producto masVendido = producto1;
        if (producto2.darCantidadUnidadesVendidas() > masVendido.darCantidadUnidadesVendidas() ){
            masVendido = producto2;
        }
        if (producto3.darCantidadUnidadesVendidas() > masVendido.darCantidadUnidadesVendidas()){
            masVendido = producto3;
        }
        if (producto4.darCantidadUnidadesVendidas() > masVendido.darCantidadUnidadesVendidas()){
            masVendido = producto4;
        }
        return masVendido.darCantidadUnidadesVendidas() > 0 ? masVendido : null;
    }

    /**
     * Retorna el producto con menos unidades vendidas.
     *
     * @return Producto con menos unidades vendidas. Null si ning�n producto tiene unidades vendidas.
     */
    public Producto darProductoMenosVendido() {
        Producto menosVendido = producto1;
        // TODO: Obtiene y retorna el prodcuto menos vendido
        if (producto2.darCantidadUnidadesVendidas() < menosVendido.darCantidadUnidadesVendidas() ){
            menosVendido = producto2;
        }
        if (producto3.darCantidadUnidadesVendidas() < menosVendido.darCantidadUnidadesVendidas()){
            menosVendido = producto3;
        }
        if (producto4.darCantidadUnidadesVendidas() < menosVendido.darCantidadUnidadesVendidas()){
            menosVendido = producto4;
        }
        return menosVendido.darCantidadUnidadesVendidas() >= 0 ? menosVendido : null;
    }

    /**
     * Vende una cantidad de unidades de producto de la tienda, dado su nombre por par�metro. <br>
     * <b>post: </b> Disminuy� la cantidad de unidades del producto dado
     * y se actualiz� el dinero de la caja a partir de la cantidad real vendida multiplicada
     * por el precio final (con IVA) del producto vendido..
     *
     * @param pNombreProducto Nombre del producto a vender.
     * @param pCantidad       Cantidad de unidades del producto a vender. pCantidad > 0.
     * @return Cantidad que fue efectivamente vendida.
     */
    public int venderProducto(String pNombreProducto, int pCantidad) {
        // TODO: Vender la cantidad pCantidad del producto con el nombre dado
        int cantidadVendida = 0;
        Producto producto = darProducto(pNombreProducto);
        if (producto != null){
            cantidadVendida = producto.vender(pCantidad);
            dineroEnCaja += cantidadVendida * producto.calcularPrecioFinal();
            return cantidadVendida;
        }
        return 0;
    }

    /**
     * Abastece un producto dado su nombre, con la cantidad de unidades dadas. <br>
     * <b>post: </b> Aument� la cantidad de unidades en bodega del producto dado.
     *
     * @param pNombreProducto Nombre del producto a abastecer.
     * @param pCantidad       La cantidad de unidades a abastecer. cantidad >= 0.
     * @return Retorna true si se pudo efectuar el abastecimiento, false en caso contrario.
     */
    public boolean abastecerProducto(String pNombreProducto, int pCantidad) {
        // TODO: Abastece el producto con el nombre dado en la cantidad especificada
        Producto producto = darProducto(pNombreProducto);
        if (producto.puedeAbastecer()) {
            producto.abastecer(pCantidad);
            return true;
        }
        return false;
    }

    /**
     * Cambia el producto que tiene el nombre actual con los nuevos valores dados por par�metro. <br>
     * <b>post: </b> El nombre, tipo, valor unitario, cantidad en bodega y cantidad m�nima fueron cambiados con los valores dados por par�metro.
     *
     * @param pNombreActual   Nombre actual del producto.
     * @param pNombreNuevo    Nuevo nombre del producto.
     * @param pTipo           Tipo del producto.
     * @param pValorUnitario  Valor unitario del producto
     * @param pCantidadBodega Cantidad en bodega del producto.
     * @param pCantidadMinima Cantidad m�nima en bodega para hacer un pedido del producto.
     * @param pRutaImagen     Ruta de la imagen del producto.
     * @return Retorna true si cambi� la informaci�n del producto,
     * Retorna false si ya exist�a un producto con el nuevo nombre.
     */
    public boolean cambiarProducto(String pNombreActual, String pNombreNuevo, String pTipo, double pValorUnitario, int pCantidadBodega, int pCantidadMinima, String pRutaImagen) {
        // TODO: Cambiar la informaci�n del producto, si y solo si, no existe el producto
        // TODO: con el nombre nuevo.
        boolean cambio = false;
        Producto productoExiste = darProducto(pNombreNuevo);
        if (productoExiste == null || pNombreActual.equalsIgnoreCase(pNombreNuevo)) {
            Producto elProducto = darProducto(pNombreActual);
            if (elProducto != null) {
                elProducto.cambiarNombre(pNombreNuevo);
                elProducto.cambiarTipo(pTipo);
                elProducto.cambiarValorUnitario(pValorUnitario);
                elProducto.cambiarCantidadBodega(pCantidadBodega);
                elProducto.cambiarCantidadMinima(pCantidadMinima);
                elProducto.setRutaImagen(pRutaImagen);
                cambio = true;
                return cambio;
            }
        }

        return cambio;
    }

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * Obtiene la cantidad de productos que tienen un precio inferior al promedio de los precios
     */
    public int metodo1() {
        // TODO: "Completar"
        double promedio = (producto1.darValorUnitario() + producto2.darValorUnitario() + producto3.darValorUnitario() + producto4.darValorUnitario())/4.0;
        int contadorProductos=0;
        if (producto1.darValorUnitario()<promedio) {
            contadorProductos++;
        }
        if (producto2.darValorUnitario()<promedio) {
            contadorProductos++;
        }
        if (producto3.darValorUnitario()<promedio) {
            contadorProductos++;
        }
        if (producto4.darValorUnitario()<promedio) {
            contadorProductos++;
        }
        return contadorProductos;
    }

    /**
     * Obtiene el nombre del producto m�s barato de la tienda
     */
    public String metodo2() {
        // TODO: Completar el m�todo!
        Producto barato = producto1;
        if (producto2.darValorUnitario()<barato.darValorUnitario()) {
            barato = producto2;
        }
        if (producto3.darValorUnitario()<barato.darValorUnitario()) {
            barato = producto3;
        }
        if (producto4.darValorUnitario()<barato.darValorUnitario()) {
            barato = producto4;
        }

        return barato.darNombre();
    }
}