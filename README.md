# mcc-validator

### Description

MCC (Merchant Category Code) Validator is the simple and lightweight library that provides you few options to validate incoming mccs within your projects. 

Format of mcc-s are in **ISO 18245**. One real example can be `"0742"` which means -> `"Veterinary services"`


### Importing Library

Add this in the root **build.gradle** file

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Then add the dependency 

    dependencies {
	        implementation 'com.github.MilosVulic:mcc-validator:1.0.17'
	}
  
### Library Usage

Method `MccValidator.getNumberOfMccs()` provides the `number of the mccs` that exsists within the **ISO 18245** format.

Method `MccValidator.getDescription(String code)` provides the `description` for the given code, if the code is invalid or there is no available description for it, then `"Description not found"` is returned. 

Method `MccValidator.isCodeValid(String code)` validate the given code, returns `yes` if that code exsists within the **ISO 18245** format, `false` if not. 


Method `MccValidator.isCodeLengthValid(String code)` validate the given code length, returns `true` if it is 4 chars long and `false` otherwise. 

Method `MccValidator.isCodeFormatContainsOnlyDigits(String code)` validates the given code content, returns `true` if it contains only digits withing it, if not then `false` is returned. 

Method `MccValidator.isCodeFormatValid(String code)` represents the combination of the previous 2, and this both checks for the length and its content. 
