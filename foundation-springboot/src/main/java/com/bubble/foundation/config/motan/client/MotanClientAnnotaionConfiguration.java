/**
 * Copyright [2015-2017]
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.bubble.foundation.config.motan.client;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.bubble.foundation.config.motan.client.MotanClientConfiguration;
import com.weibo.api.motan.config.springsupport.AnnotationBean;

/**
 * 
 * @author xiaoshiwen<xiaoshiwen@zitopay.com>
 * @since 2017年1月17日
 */
@Configurable
@Import(value = { MotanClientConfiguration.class})
public class MotanClientAnnotaionConfiguration {

	/**
	 * 启动motan
	 * @return
	 */
	@Bean
	public AnnotationBean annotationBean() {
		AnnotationBean bean = new AnnotationBean();
		bean.setPackage("com.zitopay");
		return bean;
	}
}
