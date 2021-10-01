package com.learning.builder1;

public class CodeBuilder 
{
    private String className, name ,type;

    
    public CodeBuilder(String className)
    {
        this.className = className;
        
    }
    
    public CodeBuilder addField(String name, String type)
    {
        this.name = name;
        this.type = type;
        return this;
    }

	@Override
	public String toString() {
		return "CodeBuilder [className=" + className + ", name=" + name + ", type=" + type + "]";
	}
    
    
}
