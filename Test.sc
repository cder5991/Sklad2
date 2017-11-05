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
