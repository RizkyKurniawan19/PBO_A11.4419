//no 2
fun main() {
    var result: Int = 1
    println("Masukkan bilangan bulat : ")
    var n: Int = readLine()!!.toInt();
    if (n <= 0){
        print("Angka yang dimasukkan bukan bilangan bulat atau adalah angka 0")
    } else {
        for (i in 1..n) {
            result *= i
        }
        print("Nilai $n" +" adalah " + result)
    }
}
