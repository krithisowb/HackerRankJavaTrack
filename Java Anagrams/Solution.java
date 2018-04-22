

static boolean isAnagram(String a, String b) {


        boolean result = false;


        if (a.length() == b.length()) {


            char[] ca = a.toLowerCase().toCharArray();


            char[] cb = b.toLowerCase().toCharArray();



            Map<Character, Integer> ma = new HashMap<Character, Integer>();



            Map<Character, Integer> mb = new HashMap<Character, Integer>();



            for (Character c : ca) {



                Integer i = 
;






                if (ma.get(c) != null) {



                    i = ma.get(c);



                    i++;



                }



                ma.put(c, i);



            }



            for (Character c : cb) {



                Integer i = 
;






                if (mb.get(c) != null) {



                    i = mb.get(c);



                    i++;



                }



                mb.put(c, i);



            }



            int q=
;



            Set<Character> w=ma.keySet();



            for(Map.Entry<Character, Integer> e:ma.entrySet())



            {



                if(ma.get(e.getKey())==mb.get(e.getKey()))  



                        q++;



            }



            if(q==w.size())



                result=true;



        }



        return result;



    }
