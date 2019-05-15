package hello;

import org.springframework.web.bind.annotation.RestController;

import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.resolver.AddressResolver;
import io.netty.resolver.dns.DnsAddressResolverGroup;
import io.netty.resolver.dns.DnsServerAddressStreamProviders;
import io.netty.util.concurrent.Future;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.UnknownHostException;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {

    	/*NioEventLoopGroup niogroup = new NioEventLoopGroup();
    	
    	 DnsAddressResolverGroup group = new DnsAddressResolverGroup(NioDatagramChannel.class, DnsServerAddressStreamProviders.platformDefault());
    	 
    	AddressResolver<InetSocketAddress> resolver = group.getResolver(niogroup.next());
        try {
            URI uri = new URI("redis://dev.myredis.com:6379");
            Future<List<InetSocketAddress>> allNodes = resolver.resolveAll(InetSocketAddress.createUnresolved(uri.getHost(), uri.getPort()));
            List<InetSocketAddress> list = allNodes.syncUninterruptibly().getNow();
            System.out.println(list);
        } catch (URISyntaxException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            //latch.countDown();
        }*/
    	
    	/*InetAddress address = null;
		try {
			address = InetAddress.getByName("www.google.com");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
    	System.out.println(address.getHostAddress()); 
      
        return address.getHostAddress();*/
    	
    	 
    	        return "Greetings from Spring Boot!";
    	    

        
    }
    
}
