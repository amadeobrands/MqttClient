// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package unittesting.proxies;

public class TestSuite
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject testSuiteMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "UnitTesting.TestSuite";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Module("Module"),
		LastRun("LastRun"),
		LastRunTime("LastRunTime"),
		TestCount("TestCount"),
		TestFailedCount("TestFailedCount"),
		AutoRollbackMFs("AutoRollbackMFs"),
		Result("Result");

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

	public TestSuite(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "UnitTesting.TestSuite"));
	}

	protected TestSuite(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject testSuiteMendixObject)
	{
		if (testSuiteMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("UnitTesting.TestSuite", testSuiteMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a UnitTesting.TestSuite");

		this.testSuiteMendixObject = testSuiteMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'TestSuite.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static unittesting.proxies.TestSuite initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return unittesting.proxies.TestSuite.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static unittesting.proxies.TestSuite initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new unittesting.proxies.TestSuite(context, mendixObject);
	}

	public static unittesting.proxies.TestSuite load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return unittesting.proxies.TestSuite.initialize(context, mendixObject);
	}

	public static java.util.List<unittesting.proxies.TestSuite> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<unittesting.proxies.TestSuite> result = new java.util.ArrayList<unittesting.proxies.TestSuite>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//UnitTesting.TestSuite" + xpathConstraint))
			result.add(unittesting.proxies.TestSuite.initialize(context, obj));
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
	 * @return value of Module
	 */
	public final java.lang.String getModule()
	{
		return getModule(getContext());
	}

	/**
	 * @param context
	 * @return value of Module
	 */
	public final java.lang.String getModule(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Module.toString());
	}

	/**
	 * Set value of Module
	 * @param module
	 */
	public final void setModule(java.lang.String module)
	{
		setModule(getContext(), module);
	}

	/**
	 * Set value of Module
	 * @param context
	 * @param module
	 */
	public final void setModule(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String module)
	{
		getMendixObject().setValue(context, MemberNames.Module.toString(), module);
	}

	/**
	 * @return value of LastRun
	 */
	public final java.util.Date getLastRun()
	{
		return getLastRun(getContext());
	}

	/**
	 * @param context
	 * @return value of LastRun
	 */
	public final java.util.Date getLastRun(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.LastRun.toString());
	}

	/**
	 * Set value of LastRun
	 * @param lastrun
	 */
	public final void setLastRun(java.util.Date lastrun)
	{
		setLastRun(getContext(), lastrun);
	}

	/**
	 * Set value of LastRun
	 * @param context
	 * @param lastrun
	 */
	public final void setLastRun(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date lastrun)
	{
		getMendixObject().setValue(context, MemberNames.LastRun.toString(), lastrun);
	}

	/**
	 * @return value of LastRunTime
	 */
	public final java.lang.Long getLastRunTime()
	{
		return getLastRunTime(getContext());
	}

	/**
	 * @param context
	 * @return value of LastRunTime
	 */
	public final java.lang.Long getLastRunTime(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.LastRunTime.toString());
	}

	/**
	 * Set value of LastRunTime
	 * @param lastruntime
	 */
	public final void setLastRunTime(java.lang.Long lastruntime)
	{
		setLastRunTime(getContext(), lastruntime);
	}

	/**
	 * Set value of LastRunTime
	 * @param context
	 * @param lastruntime
	 */
	public final void setLastRunTime(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long lastruntime)
	{
		getMendixObject().setValue(context, MemberNames.LastRunTime.toString(), lastruntime);
	}

	/**
	 * @return value of TestCount
	 */
	public final java.lang.Long getTestCount()
	{
		return getTestCount(getContext());
	}

	/**
	 * @param context
	 * @return value of TestCount
	 */
	public final java.lang.Long getTestCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.TestCount.toString());
	}

	/**
	 * Set value of TestCount
	 * @param testcount
	 */
	public final void setTestCount(java.lang.Long testcount)
	{
		setTestCount(getContext(), testcount);
	}

	/**
	 * Set value of TestCount
	 * @param context
	 * @param testcount
	 */
	public final void setTestCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long testcount)
	{
		getMendixObject().setValue(context, MemberNames.TestCount.toString(), testcount);
	}

	/**
	 * @return value of TestFailedCount
	 */
	public final java.lang.Long getTestFailedCount()
	{
		return getTestFailedCount(getContext());
	}

	/**
	 * @param context
	 * @return value of TestFailedCount
	 */
	public final java.lang.Long getTestFailedCount(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.TestFailedCount.toString());
	}

	/**
	 * Set value of TestFailedCount
	 * @param testfailedcount
	 */
	public final void setTestFailedCount(java.lang.Long testfailedcount)
	{
		setTestFailedCount(getContext(), testfailedcount);
	}

	/**
	 * Set value of TestFailedCount
	 * @param context
	 * @param testfailedcount
	 */
	public final void setTestFailedCount(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long testfailedcount)
	{
		getMendixObject().setValue(context, MemberNames.TestFailedCount.toString(), testfailedcount);
	}

	/**
	 * @return value of AutoRollbackMFs
	 */
	public final java.lang.Boolean getAutoRollbackMFs()
	{
		return getAutoRollbackMFs(getContext());
	}

	/**
	 * @param context
	 * @return value of AutoRollbackMFs
	 */
	public final java.lang.Boolean getAutoRollbackMFs(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.AutoRollbackMFs.toString());
	}

	/**
	 * Set value of AutoRollbackMFs
	 * @param autorollbackmfs
	 */
	public final void setAutoRollbackMFs(java.lang.Boolean autorollbackmfs)
	{
		setAutoRollbackMFs(getContext(), autorollbackmfs);
	}

	/**
	 * Set value of AutoRollbackMFs
	 * @param context
	 * @param autorollbackmfs
	 */
	public final void setAutoRollbackMFs(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean autorollbackmfs)
	{
		getMendixObject().setValue(context, MemberNames.AutoRollbackMFs.toString(), autorollbackmfs);
	}

	/**
	 * Set value of Result
	 * @param result
	 */
	public final unittesting.proxies.UnitTestResult getResult()
	{
		return getResult(getContext());
	}

	/**
	 * @param context
	 * @return value of Result
	 */
	public final unittesting.proxies.UnitTestResult getResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Result.toString());
		if (obj == null)
			return null;

		return unittesting.proxies.UnitTestResult.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Result
	 * @param result
	 */
	public final void setResult(unittesting.proxies.UnitTestResult result)
	{
		setResult(getContext(), result);
	}

	/**
	 * Set value of Result
	 * @param context
	 * @param result
	 */
	public final void setResult(com.mendix.systemwideinterfaces.core.IContext context, unittesting.proxies.UnitTestResult result)
	{
		if (result != null)
			getMendixObject().setValue(context, MemberNames.Result.toString(), result.toString());
		else
			getMendixObject().setValue(context, MemberNames.Result.toString(), null);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return testSuiteMendixObject;
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
			final unittesting.proxies.TestSuite that = (unittesting.proxies.TestSuite) obj;
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
		return "UnitTesting.TestSuite";
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
