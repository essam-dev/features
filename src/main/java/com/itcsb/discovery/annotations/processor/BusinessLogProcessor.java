package com.itcsb.discovery.annotations.processor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;

@SupportedAnnotationTypes({ "com.itcsb.discovery.annotations.annotates.BusinessLog" })

public class BusinessLogProcessor extends AbstractProcessor {

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		for (TypeElement te : annotations) {
			for (Element e : roundEnv.getElementsAnnotatedWith(te)) {
				System.out.println("Annotation " + te.getSimpleName() + " for " + e.toString());
			}
		}
		return true;
	}

}
