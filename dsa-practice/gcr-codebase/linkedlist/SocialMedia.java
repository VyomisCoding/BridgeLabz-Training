// Friend node (stores friend IDs)
class Friend{
    int friendId;
    Friend next;

    Friend(int id){
        friendId = id;
    }
}

class User{    // User node
    int userId, age;
    String name;
    Friend friends;   // head of friend list
    User next;

    User(int id, String n, int a){
        userId = id;
        name = n;
        age = a;
    }
}

class SocialMedia{
    User head;
    
    void addUser(int id, String name, int age){   // add new user
        User u = new User(id, name, age);
        u.next = head;
        head = u;
    }
    
    void addFriend(int userId, int friendId){   // add friend connection (one side for simplicity)
        User u = findUser(userId);
        if (u == null) return;
        Friend f = new Friend(friendId);
        f.next = u.friends;
        u.friends = f;
    }
    
    void displayFriends(int userId){   // display friends of a user
        User u = findUser(userId);
        if (u == null) return;
        Friend f = u.friends;
        while (f != null) {
            System.out.print(f.friendId + " ");
            f = f.next;
        }
        System.out.println();
    }
    
    void mutualFriends(int u1, int u2){   // find mutual friends
        User a = findUser(u1);
        User b = findUser(u2);
        for (Friend f1 = a.friends; f1 != null; f1 = f1.next) {
            for (Friend f2 = b.friends; f2 != null; f2 = f2.next) {
                if (f1.friendId == f2.friendId)
                    System.out.print(f1.friendId + " ");
            }
        }
        System.out.println();
    }

    void countFriends(int userId){   // count friends
        int count = 0;
        Friend f = findUser(userId).friends;
        while (f != null){
            count++;
            f = f.next;
        }
        System.out.println("Total friends: " + count);
    }

    User findUser(int id){
        for (User t = head; t != null; t = t.next)
            if (t.userId == id) return t;
        return null;
    }
}
