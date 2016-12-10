// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package testmqttclient.proxies;

public class MqttJsonMessaage
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mqttJsonMessaageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "TestMqttClient.MqttJsonMessaage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Test("Test"),
		Topic("Topic"),
		Index("Index"),
		Timestamp("Timestamp"),
		MqttTopic("MqttTopic");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MqttJsonMessaage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "TestMqttClient.MqttJsonMessaage"));
	}

	protected MqttJsonMessaage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mqttJsonMessaageMendixObject)
	{
		if (mqttJsonMessaageMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("TestMqttClient.MqttJsonMessaage", mqttJsonMessaageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a TestMqttClient.MqttJsonMessaage");

		this.mqttJsonMessaageMendixObject = mqttJsonMessaageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MqttJsonMessaage.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static testmqttclient.proxies.MqttJsonMessaage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return testmqttclient.proxies.MqttJsonMessaage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static testmqttclient.proxies.MqttJsonMessaage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new testmqttclient.proxies.MqttJsonMessaage(context, mendixObject);
	}

	public static testmqttclient.proxies.MqttJsonMessaage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return testmqttclient.proxies.MqttJsonMessaage.initialize(context, mendixObject);
	}

	public static java.util.List<testmqttclient.proxies.MqttJsonMessaage> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<testmqttclient.proxies.MqttJsonMessaage> result = new java.util.ArrayList<testmqttclient.proxies.MqttJsonMessaage>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//TestMqttClient.MqttJsonMessaage" + xpathConstraint))
			result.add(testmqttclient.proxies.MqttJsonMessaage.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of Test
	 */
	public final java.lang.String getTest()
	{
		return getTest(getContext());
	}

	/**
	 * @param context
	 * @return value of Test
	 */
	public final java.lang.String getTest(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Test.toString());
	}

	/**
	 * Set value of Test
	 * @param test
	 */
	public final void setTest(java.lang.String test)
	{
		setTest(getContext(), test);
	}

	/**
	 * Set value of Test
	 * @param context
	 * @param test
	 */
	public final void setTest(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String test)
	{
		getMendixObject().setValue(context, MemberNames.Test.toString(), test);
	}

	/**
	 * @return value of Topic
	 */
	public final java.lang.String getTopic()
	{
		return getTopic(getContext());
	}

	/**
	 * @param context
	 * @return value of Topic
	 */
	public final java.lang.String getTopic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Topic.toString());
	}

	/**
	 * Set value of Topic
	 * @param topic
	 */
	public final void setTopic(java.lang.String topic)
	{
		setTopic(getContext(), topic);
	}

	/**
	 * Set value of Topic
	 * @param context
	 * @param topic
	 */
	public final void setTopic(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String topic)
	{
		getMendixObject().setValue(context, MemberNames.Topic.toString(), topic);
	}

	/**
	 * @return value of Index
	 */
	public final java.lang.Integer getIndex()
	{
		return getIndex(getContext());
	}

	/**
	 * @param context
	 * @return value of Index
	 */
	public final java.lang.Integer getIndex(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.Index.toString());
	}

	/**
	 * Set value of Index
	 * @param index
	 */
	public final void setIndex(java.lang.Integer index)
	{
		setIndex(getContext(), index);
	}

	/**
	 * Set value of Index
	 * @param context
	 * @param index
	 */
	public final void setIndex(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer index)
	{
		getMendixObject().setValue(context, MemberNames.Index.toString(), index);
	}

	/**
	 * @return value of Timestamp
	 */
	public final java.util.Date getTimestamp()
	{
		return getTimestamp(getContext());
	}

	/**
	 * @param context
	 * @return value of Timestamp
	 */
	public final java.util.Date getTimestamp(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Timestamp.toString());
	}

	/**
	 * Set value of Timestamp
	 * @param timestamp
	 */
	public final void setTimestamp(java.util.Date timestamp)
	{
		setTimestamp(getContext(), timestamp);
	}

	/**
	 * Set value of Timestamp
	 * @param context
	 * @param timestamp
	 */
	public final void setTimestamp(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date timestamp)
	{
		getMendixObject().setValue(context, MemberNames.Timestamp.toString(), timestamp);
	}

	/**
	 * @return value of MqttTopic
	 */
	public final java.lang.String getMqttTopic()
	{
		return getMqttTopic(getContext());
	}

	/**
	 * @param context
	 * @return value of MqttTopic
	 */
	public final java.lang.String getMqttTopic(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.MqttTopic.toString());
	}

	/**
	 * Set value of MqttTopic
	 * @param mqtttopic
	 */
	public final void setMqttTopic(java.lang.String mqtttopic)
	{
		setMqttTopic(getContext(), mqtttopic);
	}

	/**
	 * Set value of MqttTopic
	 * @param context
	 * @param mqtttopic
	 */
	public final void setMqttTopic(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String mqtttopic)
	{
		getMendixObject().setValue(context, MemberNames.MqttTopic.toString(), mqtttopic);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mqttJsonMessaageMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final testmqttclient.proxies.MqttJsonMessaage that = (testmqttclient.proxies.MqttJsonMessaage) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "TestMqttClient.MqttJsonMessaage";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
