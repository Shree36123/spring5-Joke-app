package guru.springframework.jokeapp.services;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
@ComponentScan("guru.springframework.norris.chuck")
public class JokeserviceImpl implements JokeService {

	public ChuckNorrisQuotes chuckNorrisQuotes;
	
	public JokeserviceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}



	@Override
	public String getJokes() {
		return chuckNorrisQuotes.getRandomQuote();
	}

}
