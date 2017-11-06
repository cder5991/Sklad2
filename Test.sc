//1
val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val inputText = "GHMABGZ VKXTMXL LNVVXLL EBDX GHG-LMHI, XGMANLBTLMBV XYYHKM"
def f(shift: Int): Unit = {
  val outputText = inputText.map((c: Char) => {

    val x = alphabet.indexOf(c.toUpper)

    if (x == -1) {
      c
    }
    else {
      alphabet((x + shift) % alphabet.size)
    }
  });
  println(outputText);
}
for (i <- 1 to 25) {
  f(i)
}

//2
val str1 = "10001011101010101010000111110111011110101010101101110101010101010010000010110100101010101011011010100101011010101010101010101010101110101011000101101011110101010101010101010001010101010101101010101010101010101010101010111000001010101111010100111010101001011101010111111111101010101111111101010111110101001010101111110111101011010111111101011110101111111111111101111111111010101111101010101001111101010101010100100101010111101001010101001010101001010111110101010101010101011110101010010101001111101010100101111101010101001111111111101010111111111101001010111111110110101001111101010101111111010110100011111111111010101101011111110101010101110101010101010001110111101010101010101010101000001010110111111010101010010101011110101010000001010101000000000000101001111100000000000010010101010000001\n1110010100001010100000101001000001010101100011000011010100000101010000001000000001010110000011010010001011111111111111101001000101000000100000010000010101111010100000000101010000000101010010101011100101010000000000001010101010110101"
val str2 = "0010101010101111001010000000000000001010010100111000010000000010100001010101000000110000001010101000000000000101001111100000000000010010101010000001"
def dozeroes(str: String, len: Int): String = {
  var newstr: Array[String] = Array(str)
  var i = str.length
  while (i != len) {
    newstr +:= "0"
    i += 1
  }
  newstr.mkString
}
def max (a: Int, b: Int): Int = {
  if (a > b)
    a
  else
    b
}
def add(str1: String, str2: String): String = {
  val maxx = max(str1.length, str2.length)
  val newstr1 = dozeroes(str1, maxx)
  val newstr2 = dozeroes(str2, maxx)
  var zeros = 0
  var once = 0
  var res: Array[String] = Array()
  var a = 0
  var temp = 0
  for (i <- maxx - 1 to 0 by -1) {
    a = newstr1(i) - '0' + newstr2(i) - '0' + temp
    if (a == 2) {
      temp = 1
      zeros += 1
      res +:= "0"
    }
    else if (a == 3) {
      temp = 1
      once += 1
      res +:= "1"
    }
    else if (a == 0) {
      temp = 0
      zeros += 1
      res +:= "0"
    }
    else {
      temp = 0
      res +:= "1"
      once += 1
    }
  }
  if (temp == 1) {
    res +:= "1"
    once += 1
  }
  println(once - zeros)
  res.mkString
 }
val res = add(str1, str2)
var sum = 0;
for(i <- res) {
  if (i == '0') {
    sum -= 1
  }
  else {
    sum += 1
  }
}
println (sum)
