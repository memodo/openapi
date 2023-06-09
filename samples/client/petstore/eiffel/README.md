# Eiffel API client for openapi

This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://openapis.org) from a remote server, you can easily generate an API client.

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.EiffelClientCodegen

## Installation
Add the library into your Eiffel configuration file.
```
    "<library name="api_client" location="%PATH_TO_EIFFEL_OPENAPI_CLIENT%\api_client.ecf"/>"
```

## Documentation for API Endpoints

All URIs are relative to *http://petstore.swagger.io:80/v2*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ANOTHERFAKE_API* | [**call123test_special_tags**](docs/ANOTHERFAKE_API.md#call123test_special_tags) | **Patch** /another-fake/dummy | To test special tags
*FAKE_API* | [**create_xml_item**](docs/FAKE_API.md#create_xml_item) | **Post** /fake/create_xml_item | creates an XmlItem
*FAKE_API* | [**fake_outer_boolean_serialize**](docs/FAKE_API.md#fake_outer_boolean_serialize) | **Post** /fake/outer/boolean | 
*FAKE_API* | [**fake_outer_composite_serialize**](docs/FAKE_API.md#fake_outer_composite_serialize) | **Post** /fake/outer/composite | 
*FAKE_API* | [**fake_outer_number_serialize**](docs/FAKE_API.md#fake_outer_number_serialize) | **Post** /fake/outer/number | 
*FAKE_API* | [**fake_outer_string_serialize**](docs/FAKE_API.md#fake_outer_string_serialize) | **Post** /fake/outer/string | 
*FAKE_API* | [**test_body_with_file_schema**](docs/FAKE_API.md#test_body_with_file_schema) | **Put** /fake/body-with-file-schema | 
*FAKE_API* | [**test_body_with_query_params**](docs/FAKE_API.md#test_body_with_query_params) | **Put** /fake/body-with-query-params | 
*FAKE_API* | [**test_client_model**](docs/FAKE_API.md#test_client_model) | **Patch** /fake | To test \&quot;client\&quot; model
*FAKE_API* | [**test_endpoint_parameters**](docs/FAKE_API.md#test_endpoint_parameters) | **Post** /fake | Fake endpoint for testing various parameters  假端點  偽のエンドポイント  가짜 엔드 포인트
*FAKE_API* | [**test_enum_parameters**](docs/FAKE_API.md#test_enum_parameters) | **Get** /fake | To test enum parameters
*FAKE_API* | [**test_group_parameters**](docs/FAKE_API.md#test_group_parameters) | **Delete** /fake | Fake endpoint to test group parameters (optional)
*FAKE_API* | [**test_inline_additional_properties**](docs/FAKE_API.md#test_inline_additional_properties) | **Post** /fake/inline-additionalProperties | test inline additionalProperties
*FAKE_API* | [**test_json_form_data**](docs/FAKE_API.md#test_json_form_data) | **Get** /fake/jsonFormData | test json serialization of form data
*FAKE_API* | [**test_query_parameter_collection_format**](docs/FAKE_API.md#test_query_parameter_collection_format) | **Put** /fake/test-query-parameters | 
*FAKECLASSNAMETAGS123_API* | [**test_classname**](docs/FAKECLASSNAMETAGS123_API.md#test_classname) | **Patch** /fake_classname_test | To test class name in snake case
*PET_API* | [**add_pet**](docs/PET_API.md#add_pet) | **Post** /pet | Add a new pet to the store
*PET_API* | [**delete_pet**](docs/PET_API.md#delete_pet) | **Delete** /pet/{petId} | Deletes a pet
*PET_API* | [**find_pets_by_status**](docs/PET_API.md#find_pets_by_status) | **Get** /pet/findByStatus | Finds Pets by status
*PET_API* | [**find_pets_by_tags**](docs/PET_API.md#find_pets_by_tags) | **Get** /pet/findByTags | Finds Pets by tags
*PET_API* | [**pet_by_id**](docs/PET_API.md#pet_by_id) | **Get** /pet/{petId} | Find pet by ID
*PET_API* | [**update_pet**](docs/PET_API.md#update_pet) | **Put** /pet | Update an existing pet
*PET_API* | [**update_pet_with_form**](docs/PET_API.md#update_pet_with_form) | **Post** /pet/{petId} | Updates a pet in the store with form data
*PET_API* | [**upload_file**](docs/PET_API.md#upload_file) | **Post** /pet/{petId}/uploadImage | uploads an image
*PET_API* | [**upload_file_with_required_file**](docs/PET_API.md#upload_file_with_required_file) | **Post** /fake/{petId}/uploadImageWithRequiredFile | uploads an image (required)
*STORE_API* | [**delete_order**](docs/STORE_API.md#delete_order) | **Delete** /store/order/{order_id} | Delete purchase order by ID
*STORE_API* | [**inventory**](docs/STORE_API.md#inventory) | **Get** /store/inventory | Returns pet inventories by status
*STORE_API* | [**order_by_id**](docs/STORE_API.md#order_by_id) | **Get** /store/order/{order_id} | Find purchase order by ID
*STORE_API* | [**place_order**](docs/STORE_API.md#place_order) | **Post** /store/order | Place an order for a pet
*USER_API* | [**create_user**](docs/USER_API.md#create_user) | **Post** /user | Create user
*USER_API* | [**create_users_with_array_input**](docs/USER_API.md#create_users_with_array_input) | **Post** /user/createWithArray | Creates list of users with given input array
*USER_API* | [**create_users_with_list_input**](docs/USER_API.md#create_users_with_list_input) | **Post** /user/createWithList | Creates list of users with given input array
*USER_API* | [**delete_user**](docs/USER_API.md#delete_user) | **Delete** /user/{username} | Delete user
*USER_API* | [**login_user**](docs/USER_API.md#login_user) | **Get** /user/login | Logs user into the system
*USER_API* | [**logout_user**](docs/USER_API.md#logout_user) | **Get** /user/logout | Logs out current logged in user session
*USER_API* | [**update_user**](docs/USER_API.md#update_user) | **Put** /user/{username} | Updated user
*USER_API* | [**user_by_name**](docs/USER_API.md#user_by_name) | **Get** /user/{username} | Get user by user name


## Documentation For Models

 - [ADDITIONAL_PROPERTIES_ANY_TYPE](docs/ADDITIONAL_PROPERTIES_ANY_TYPE.md)
 - [ADDITIONAL_PROPERTIES_ARRAY](docs/ADDITIONAL_PROPERTIES_ARRAY.md)
 - [ADDITIONAL_PROPERTIES_BOOLEAN](docs/ADDITIONAL_PROPERTIES_BOOLEAN.md)
 - [ADDITIONAL_PROPERTIES_CLASS](docs/ADDITIONAL_PROPERTIES_CLASS.md)
 - [ADDITIONAL_PROPERTIES_INTEGER](docs/ADDITIONAL_PROPERTIES_INTEGER.md)
 - [ADDITIONAL_PROPERTIES_NUMBER](docs/ADDITIONAL_PROPERTIES_NUMBER.md)
 - [ADDITIONAL_PROPERTIES_OBJECT](docs/ADDITIONAL_PROPERTIES_OBJECT.md)
 - [ADDITIONAL_PROPERTIES_STRING](docs/ADDITIONAL_PROPERTIES_STRING.md)
 - [ANIMAL](docs/ANIMAL.md)
 - [API_RESPONSE](docs/API_RESPONSE.md)
 - [ARRAY_OF_ARRAY_OF_NUMBER_ONLY](docs/ARRAY_OF_ARRAY_OF_NUMBER_ONLY.md)
 - [ARRAY_OF_NUMBER_ONLY](docs/ARRAY_OF_NUMBER_ONLY.md)
 - [ARRAY_TEST](docs/ARRAY_TEST.md)
 - [BIG_CAT](docs/BIG_CAT.md)
 - [BIG_CAT_ALL_OF](docs/BIG_CAT_ALL_OF.md)
 - [CAPITALIZATION](docs/CAPITALIZATION.md)
 - [CAT](docs/CAT.md)
 - [CATEGORY](docs/CATEGORY.md)
 - [CAT_ALL_OF](docs/CAT_ALL_OF.md)
 - [CLASS_MODEL](docs/CLASS_MODEL.md)
 - [CLIENT](docs/CLIENT.md)
 - [DOG](docs/DOG.md)
 - [DOG_ALL_OF](docs/DOG_ALL_OF.md)
 - [ENUM_ARRAYS](docs/ENUM_ARRAYS.md)
 - [ENUM_CLASS](docs/ENUM_CLASS.md)
 - [ENUM_TEST](docs/ENUM_TEST.md)
 - [FILE_SCHEMA_TEST_CLASS](docs/FILE_SCHEMA_TEST_CLASS.md)
 - [FORMAT_TEST](docs/FORMAT_TEST.md)
 - [HAS_ONLY_READ_ONLY](docs/HAS_ONLY_READ_ONLY.md)
 - [MAP_TEST](docs/MAP_TEST.md)
 - [MIXED_PROPERTIES_AND_ADDITIONAL_PROPERTIES_CLASS](docs/MIXED_PROPERTIES_AND_ADDITIONAL_PROPERTIES_CLASS.md)
 - [MODEL_200_RESPONSE](docs/MODEL_200_RESPONSE.md)
 - [NAME](docs/NAME.md)
 - [NUMBER_ONLY](docs/NUMBER_ONLY.md)
 - [ORDER](docs/ORDER.md)
 - [OUTER_COMPOSITE](docs/OUTER_COMPOSITE.md)
 - [OUTER_ENUM](docs/OUTER_ENUM.md)
 - [PET](docs/PET.md)
 - [READ_ONLY_FIRST](docs/READ_ONLY_FIRST.md)
 - [RETURN](docs/RETURN.md)
 - [SPECIAL_MODEL_NAME](docs/SPECIAL_MODEL_NAME.md)
 - [TAG](docs/TAG.md)
 - [TYPE_HOLDER_DEFAULT](docs/TYPE_HOLDER_DEFAULT.md)
 - [TYPE_HOLDER_EXAMPLE](docs/TYPE_HOLDER_EXAMPLE.md)
 - [USER](docs/USER.md)
 - [XML_ITEM](docs/XML_ITEM.md)


## Documentation For Authorization


## api_key

- **Type**: API key 
- **API key parameter name**: api_key
- **Location**: HTTP header

## api_key_query

- **Type**: API key 
- **API key parameter name**: api_key_query
- **Location**: URL query string

## http_basic_test

- **Type**: HTTP basic authentication

## petstore_auth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: http://petstore.swagger.io/api/oauth/dialog
- **Scopes**: 
 - **write:pets**: modify pets in your account
 - **read:pets**: read your pets


## Author



