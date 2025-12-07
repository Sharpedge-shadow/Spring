AutoWire Working

What if there is more than one bean of same type then how spring identify with which it need to select for autowiring

there are three steps:
Step 1: It will try to match the name of the bean which we used if it is present then autowire 
if not move to step 2. (Step 1 get remove after spring 6.1)
Step 2: check Bean having @Primary Annotation if not move to step 3
Step 3: Check @Qualifier with autowiring Configuration 
