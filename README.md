# mcc-validator

<a href="https://ko-fi.com/milosvulic79274" rel="nofollow"><img height="36" style="height: 36px; max-width: 100%;" src="https://camo.githubusercontent.com/e2db15bc11b5ab5aa35e401e94f8820d78b674c8bd49ce0f05a50300d4228417/68747470733a2f2f617a3734333730322e766f2e6d7365636e642e6e65742f63646e2f6b6f6669312e706e673f763d30" border="0" alt="Buy Me a Coffee at ko-fi.com" data-canonical-src="https://az743702.vo.msecnd.net/cdn/kofi1.png?v=0"></a>

### Description

MCC (Merchant Category Code) Validator is the simple and lightweight library that provides you few options to validate incoming mccs within your projects. 

Format of mcc-s are in **ISO 18245**. One real example can be `"0742"` which means -> `"Veterinary services"`


### Importing Library

[![](https://jitpack.io/v/MilosVulic/mcc-validator.svg)](https://jitpack.io/#MilosVulic/mcc-validator)

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

*  Method `MccValidator.getNumberOfMccs()` provides the `number of the mccs` that exsists within the **ISO 18245** format.

*  Method `MccValidator.getDescription(String code)` provides the `description` for the given code, if the code is invalid or there is no available description for it, then `"Description not found"` is returned. 

*  Method `MccValidator.isCodeValid(String code)` validate the given code, returns `yes` if that code exsists within the **ISO 18245** format, `false` if not. 


*  Method `MccValidator.isCodeLengthValid(String code)` validate the given code length, returns `true` if it is 4 chars long and `false` otherwise. 

*  Method `MccValidator.isCodeFormatContainsOnlyDigits(String code)` validates the given code content, returns `true` if it contains only digits withing it, if not then `false` is returned. 

*  Method `MccValidator.isCodeFormatValid(String code)` represents the combination of the previous 2, and this both checks for the length and its content. 
