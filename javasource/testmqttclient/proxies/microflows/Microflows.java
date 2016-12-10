// This file was generated by Mendix Modeler 6.10.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testmqttclient.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the TestMqttClient module
	public static void onMessageTestSubscribe(IContext context, java.lang.String _payload, java.lang.String _topic)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Payload", _payload);
			params.put("Topic", _topic);
			Core.execute(context, "TestMqttClient.OnMessageTestSubscribe", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void onTopic1ImportMessage(IContext context, java.lang.String _payload, java.lang.String _topic)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Payload", _payload);
			params.put("Topic", _topic);
			Core.execute(context, "TestMqttClient.OnTopic1ImportMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void onTopic1Message(IContext context, java.lang.String _payload, java.lang.String _topic)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Payload", _payload);
			params.put("Topic", _topic);
			Core.execute(context, "TestMqttClient.OnTopic1Message", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void onTopic2ImportMessage(IContext context, java.lang.String _payload, java.lang.String _topic)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Payload", _payload);
			params.put("Topic", _topic);
			Core.execute(context, "TestMqttClient.OnTopic2ImportMessage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void onTopic2Message(IContext context, java.lang.String _payload, java.lang.String _topic)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Payload", _payload);
			params.put("Topic", _topic);
			Core.execute(context, "TestMqttClient.OnTopic2Message", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void testAwsIotSubscribe(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "TestMqttClient.TestAwsIotSubscribe", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void testSubscribeTwoMosquittoImportTopics(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "TestMqttClient.TestSubscribeTwoMosquittoImportTopics", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void testSubscribeTwoMosquittoTopics(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "TestMqttClient.TestSubscribeTwoMosquittoTopics", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void testTTNSubscribe(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "TestMqttClient.TestTTNSubscribe", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}