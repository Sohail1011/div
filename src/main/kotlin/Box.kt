class Box(
    val length: Int = 0,
    val width: Int = 0,
    val height: Int = 0,
) {
    init {
        println("Box is created")
    }

    constructor() : this(length = 12, width = 9, height = 5) {
        println("Your box is created")
    }

    val volume get() = length * width * height

    var boxName: String = "Box Name"
        set(value) {
            if (value.length < 3) {
                println("The name is too short")
            } else {
                field = value
            }
        }

    fun fillContents() {
        println("Filling the box with contents.")
    }

    fun Open() {
        println("Openning the box.")
    }
}