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
package com.bubble.foundation.config.springboot;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.bubble.foundation.common.env.DigestEnvironment;

/**
 * @author xiaoshiwen<xiaoshiwen@zitopay.com>
 * @since 2017年1月13日
 */
@Configurable
@ComponentScan("com.zitopay")
public class SpringBootApplicationConfiguration {

	@Bean
	public DigestEnvironment digesteEnvironment() {
		return new DigestEnvironment();
	}

	@Bean
	ApplicationHolder applicationHolder(ApplicationContext applicationContext) {
		ApplicationHolder holder = new ApplicationHolder();
		holder.setApplicationContext(applicationContext);
		return holder;
	}

}
