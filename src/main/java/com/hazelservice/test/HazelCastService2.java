/**
 * 
 */
package com.hazelservice.test;

import java.util.Map;
import java.util.Set;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.Member;
import com.hazelcast.instance.HazelcastInstanceFactory;

/**
 * @author Vipin Rawat
 *
 */
public class HazelCastService2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 HazelcastInstance hazelcast = Hazelcast.newHazelcastInstance();
	        Set<HazelcastInstance> instances = HazelcastInstanceFactory.getAllHazelcastInstances();
	        for (HazelcastInstance instance: instances) {
	            System.out.println(instance.getName());
	            for (Member member : instance.getCluster().getMembers()) {
	                System.out.println("Member: " + member);
	            }
	        }
	        Map<String, String> empMap = hazelcast.getMap("customers");
	        empMap.put("02", "CVS");
	        empMap.put("03", "Walmart");
	    }
}
