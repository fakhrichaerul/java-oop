package com.company.data;

class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {
    final void login(String username, String password) {
        //isi method
    }
}

//class FakeFacebook extends Facebook {
        // Method error karna final tidak bisa dioverride
//    void login(String username, String password) {
//    }
//}
