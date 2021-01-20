package demo5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlLib implements Iterable<String>{

	private LinkedList<String> urls = new LinkedList<String>();
	
	private class urlIterator implements Iterator<String> {

		private int index=0;
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < urls.size();
		}

		@Override
		public String next() {
			// TODO Auto-generated method stub
			StringBuilder sb = new StringBuilder();
			try {
			URL url=new URL( urls.get(index));
			
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			
			String line = null;
			while((line= br.readLine())!=null) {
				sb.append(line);
				sb.append("\n");
			}
			br.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}
			index++;
			return sb.toString();
		}
		
		@Override
		public void remove() {
			urls.remove(index);
		}
		
	}
	
	public UrlLib() {
		urls.add("http://www.amazon.com");
		urls.add("http://www.flipkart.com");
		urls.add("http://www.eBay.com");
		urls.add("http://www.Myntra.com");
		urls.add("http://www.Alibaba.com");
		
		
		
	}

	@Override
	public Iterator<String> iterator() {
		// TODO Auto-generated method stub
		return new urlIterator();
	}
	

//	@Override
//	public Iterator<String> iterator() {
//		// TODO Auto-generated method stub
//		return url.iterator();
//	}
	
	
}
