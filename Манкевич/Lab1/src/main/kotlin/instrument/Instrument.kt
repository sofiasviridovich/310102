package instrument

import product.Product
import product.Workpiece

abstract class Instrument(val weight: Double) {
    abstract fun work(workpiece: Workpiece)
}

class Saw(private val length: Double, weight: Double) : Instrument(weight) {

    private fun sawing() {
        println("Sawing")
    }

    override fun work(workpiece: Workpiece) {
        println("Saw is used")
        sawing()
        workpiece.changeShapeRequest("cut")
    }
}

class Plane(weight: Double) : Instrument(weight) {
    fun planing() {
        println("Planing")
    }

    override fun work(workpiece: Workpiece) {
        println("Plane is used")
        planing()
        workpiece.changeShapeRequest("smooth")
    }
}

class Screwdriver(weight: Double) : Instrument(weight) {
    override fun work(workpiece: Workpiece) {
        println("Screwdriver is used")
    }

    fun screw(workpiece1: Workpiece, workpiece2: Workpiece): Product {
        println("${workpiece1.name} и ${workpiece2.name} screwed")
        val product = Product()
        product.setProductReady(true)
        return product
    }

    fun unscrew(workpiece1: Workpiece,workpiece2: Workpiece,product: Product):Product
        { println("${workpiece1.name} и ${workpiece2.name} unscrewed")
        product.setProductReady(false)
        return product
        }
}
///Imroman