public Account(String requestedName){
  String name = requestedName;
  int i = 1;
  while(name.isAvailable()==false){
      name = requestedName+Integer.toString(i);
      i++;
  }
  username = name;
}
