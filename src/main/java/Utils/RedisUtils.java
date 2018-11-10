package Utils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.concurrent.ExecutionException;

public class RedisUtils {

    public static Jedis getJedisInstance()
    {
        try {


            JedisPool pool = new JedisPool(new JedisPoolConfig(), "localhost");
            Jedis jedis = pool.getResource();
            return jedis;
        }
        catch (Exception e)
        {
            System.out.println("Redis ответил ошибкой"+e.getMessage());
        }
        return null;
    }

}
