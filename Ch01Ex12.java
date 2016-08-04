// Original
public String toLowerCase(Locale locale) {
  /* ... */
  int firstUpper;
  final int len = value.length;

  /* Now check if there are any characters that need to be changed. */
  scan: {
    for (firstUpper = 0 ; firstUpper < len; ) {
      char c = value[firstUpper];
      if ((c >= Character.MIN_HIGH_SURROGATE)
          && (c <= Character.MAX_HIGH_SURROGATE)) {
        int supplChar = codePointAt(firstUpper);
        if (supplChar != Character.toLowerCase(supplChar)) {
          break scan;
        }
      firstUpper += Character.charCount(supplChar);
      } else {
        if (c != Character.toLowerCase(c)) {
          break scan;
        }
        firstUpper++;
      }
    }
      return this;
  }
  /* ... */
}

// Modified
public String toLowerCase(Locale locale) {
  /* ... */
  int firstUpper;
  final int len = value.length;
	boolean found = false;
  
  /* Now check if there are any characters that need to be changed. */
  for (firstUpper = 0 ; firstUpper < len && !found; ) {
    char c = value[firstUpper];
    if ((c >= Character.MIN_HIGH_SURROGATE)
        && (c <= Character.MAX_HIGH_SURROGATE)) {
      int supplChar = codePointAt(firstUpper);
      firstUpper += Character.charCount(supplChar);
      if (supplChar != Character.toLowerCase(supplChar)) {
        found = true;
      }
    } else {
    	firstUpper++;
      if (c != Character.toLowerCase(c)) {
        found = true;
      }
    }
  }
		
	if (found) {
    return this;
	}
	/* ... */
}
