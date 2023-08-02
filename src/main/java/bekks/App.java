package bekks;

import bekks.config.HibernateConfig;
import bekks.entity.Comment;
import bekks.entity.Post;
import bekks.entity.Profile;
import bekks.entity.User;
import bekks.enums.Gender;
import bekks.service.CommentService;
import bekks.service.PostService;
import bekks.service.ProfileService;
import bekks.service.UserService;
import bekks.service.impl.CommentServiceImpl;
import bekks.service.impl.ProfileServiceImpl;
import bekks.service.impl.UserServiceImpl;
import bekks.service.impl.postServiceImpl;

import java.sql.Date;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        HibernateConfig.createEntityManagerFactory();
        UserService userService = new UserServiceImpl();
        PostService postService = new postServiceImpl();
        CommentService commentService = new CommentServiceImpl();
        ProfileService profileService = new ProfileServiceImpl();

        User user =new User("Beka","bek@gmail.com","123321");

        Date date= Date.valueOf("1970-05-05");
        Profile profile=new Profile("Khaha Doniev", date, Gender.Male, "User2 bio");
        Profile profile2=new Profile("Beka Asanov", date, Gender.Male, "User3 bio");


        Post post = new Post("Photo","comment1","2023-08-1-02");
        Post post2 = new Post("PhotoMountains","comment2","2023-08-1-03");

        Date date3= Date.valueOf("2023-08-05");
        Comment comment1 = new Comment("Good job",date3);

        while (true) {
            System.out.println("""
                     1 save User
                     2 find user by id
                     3 updateProfile
                     4 delete
                     5 saveProfile
                     6 findProfileByUserId
                     7 deleteProfileByUserId
                     8 savePost
                     9 getPostByUserId
                     10 searchPost
                     11 delete post by id
                     12 saveComment
                     13 findCommentByPostId
                     14 updateComment
                     15 deleteComment
                    """);
            switch (new Scanner(System.in).nextLine()) {

                case "1"->{
                    userService.saveUser(user);
                }
                case "2"->{
                    System.out.println(userService.findUserByid(4L));
                }
                case "3"->{

                   userService.updateProfile(1L, profile);
                }
                case "4"->{
                    userService.delete(1L);
                }
                case "5"->{
                   profileService.saveProfile(1L, profile);
                }
                case "6"->{
                    System.out.println(profileService.findProfileByUserId(4L));
                }
                case "7"->{
                    profileService.deleteProfileByUserId(3L);
                }
                case "8"->{
                    postService.savePost(5L, post2);
                }
                case "9"->{
                    postService.getPostByUserId(1L).forEach(System.out::println);
                }
                case "10"->{
                    System.out.println(postService.searchPost("Photo"));
                }
                case "11"->{
                    postService.deletePostById(1L);
                }
                case "12"->{
                    commentService.saveComment(3L, 5L, comment1);
                }
                case "13"->{
                    commentService.findCommentByPostId(3L).forEach(System.out::println);
                }
                case "14"->{
                    commentService.updateComment(1L, "Молодец!");
                }
                case "15"->{
                    commentService.deleteComment(comment1);
                }
            }

        }
    }
}
