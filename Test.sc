val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val shift = 7
val inputText = "GHMABGZ VKXTMXL LNVVXLL EBDX GHG-LMHI, XGMANLBTLMBV XYYHKM"
val outputText = inputText.map((c: Char) => {

  val x = alphabet.indexOf(c.toUpper)

  if (x == -1){
    c
  }
  else
  {
    alphabet((x + shift) % alphabet.size)		}
});


println(outputText);