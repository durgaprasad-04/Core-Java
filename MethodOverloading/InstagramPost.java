package MethodOverloading;

public class InstagramPost {
	void uploadPost(String photoPath) {
		System.out.println("Photo uploaded successfully:"  +photoPath);
	}
	void uploadPost(String videoPath, int duration) {
		System.out.println("video uploaded successfully: "  +videoPath);
		System.out.println("duration"+duration+"seconds");
	}
	

	public static void main(String[] args) {
		InstagramPost in= new InstagramPost();
		in.uploadPost("https://th.bing.com/th/id/OIP.VwUIxemJi5aTGBAatvD57AHaE4?w=305&h=202&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3");
		in.uploadPost("\"C:\\Users\\Durgaprasad\\Downloads\\Hailuo_Video_walking sl.mp4\"", 5);
	
		

	}

}
