package mq.java.methods;

public class Movies 
{

	public void play() 
	{ 
		System.out.println("Play the movie");
	}
	public void pause() 
	{ 
		System.out.println("Pause the movie");
	}
	public void stop() 
	{ 
		System.out.println("stop the movie");
	}
	public static void main(String[] args) 
	{
		new Movies().play();
		new Movies().pause();
		new Movies().stop();

	}

}
