package com.qubole.qds.sdk.java.entities;

public class HadoopSettings
{
    private String master_instance_type;
    private FairSchedulerSettings fairscheduler_settings;
    private int max_nodes;
    private String slave_instance_type;
    private String slave_request_type;
    private int initial_nodes;
    private String custom_config;

    public HadoopSettings()
    {
    }

    public HadoopSettings(String master_instance_type, FairSchedulerSettings fairscheduler_settings, int max_nodes, String slave_instance_type, String slave_request_type, int initial_nodes, String custom_config)
    {
        this.master_instance_type = master_instance_type;
        this.fairscheduler_settings = fairscheduler_settings;
        this.max_nodes = max_nodes;
        this.slave_instance_type = slave_instance_type;
        this.slave_request_type = slave_request_type;
        this.initial_nodes = initial_nodes;
        this.custom_config = custom_config;
    }

    public String getMaster_instance_type()
    {
        return master_instance_type;
    }

    public void setMaster_instance_type(String master_instance_type)
    {
        this.master_instance_type = master_instance_type;
    }

    public FairSchedulerSettings getFairscheduler_settings()
    {
        return fairscheduler_settings;
    }

    public void setFairscheduler_settings(FairSchedulerSettings fairscheduler_settings)
    {
        this.fairscheduler_settings = fairscheduler_settings;
    }

    public int getMax_nodes()
    {
        return max_nodes;
    }

    public void setMax_nodes(int max_nodes)
    {
        this.max_nodes = max_nodes;
    }

    public String getSlave_instance_type()
    {
        return slave_instance_type;
    }

    public void setSlave_instance_type(String slave_instance_type)
    {
        this.slave_instance_type = slave_instance_type;
    }

    public String getSlave_request_type()
    {
        return slave_request_type;
    }

    public void setSlave_request_type(String slave_request_type)
    {
        this.slave_request_type = slave_request_type;
    }

    public int getInitial_nodes()
    {
        return initial_nodes;
    }

    public void setInitial_nodes(int initial_nodes)
    {
        this.initial_nodes = initial_nodes;
    }

    public String getCustom_config()
    {
        return custom_config;
    }

    public void setCustom_config(String custom_config)
    {
        this.custom_config = custom_config;
    }
}
