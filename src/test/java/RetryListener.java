import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class RetryListener implements IAnnotationTransformer {
    public void transform(ITestAnnotation anotation, Class aClass, Constructor constructor, Method method) {
        IRetryAnalyzer retry = anotation.getRetryAnalyzer();
        if(retry == null){
            anotation.setRetryAnalyzer(RetryFailedTestClass.class);
        }
    }
}
