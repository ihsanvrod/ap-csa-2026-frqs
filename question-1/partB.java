/**
* Returns a shortened version of username with each hyphen ("-")
* and the character before it removed, as described in part (b)
* Preconditions: username does not start or end with a hyphen.
* username does not contain consecutive hyphens.
* username.length() >= 2
* Postcondition: username is unchanged.
*/
public String getShortenedName(){
  if(username.contains("-")){
    String[] shortn = username.split("-");
    String comb = "";
    for(int i=0; i<shortn.length; i++){
      comb += shortn[i]
    }
    return comb;
  }else{
  return username; 
  }
}
