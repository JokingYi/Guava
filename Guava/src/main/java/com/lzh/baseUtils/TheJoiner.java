package com.lzh.baseUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.base.Joiner;

public class TheJoiner
{
	public static void main(String[] args)
	{
		/*
		//step3_with MapJoiner
		Map<String, String> map=new HashMap<String, String>();
		map.put("double", "seven");
		map.put("jo", "king");
		map.put("zj", "hz");
		String result=Joiner.on("#").withKeyValueSeparator("=").join(map);
		System.out.println(result);
		*/
		/*
		//step2_with stringBuilder which is_a Appendable
		List<String> strings=new ArrayList<String>(Arrays.asList("1", "2", "3", "4", null));
		StringBuilder builder=new StringBuilder();
		Joiner joiner=Joiner.on("_").skipNulls();
		joiner.appendTo(builder, strings);
		System.out.println(builder.toString());
		*/
		/*
		//step 1
		List<String> strings=new ArrayList<String>(Arrays.asList("1", "2", "3", "4", null));
		
//		System.out.println(buildString(strings, ","));
//		System.out.println(
//				Joiner.on(",")
//				.skipNulls()
//				.join(strings) );
		Joiner joiner=Joiner.on("-").skipNulls();
//		joiner.useForNull("test ");//throw an exception
		System.out.println(joiner.join(strings));
		*/
	}
	public static String buildString(List<String> strings, String delimeter)
	{
		StringBuilder builder=new StringBuilder(10);
		for (String string : strings)
		{
			if (string!=null)
			{
				builder.append(string).append(delimeter);
			}
		}
		builder.setLength(builder.length()-delimeter.length());
		return builder.toString();
	}
}
