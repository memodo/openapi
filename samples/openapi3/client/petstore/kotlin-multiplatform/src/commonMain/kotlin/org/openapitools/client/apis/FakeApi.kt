/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.apis

import org.openapitools.client.models.Client
import org.openapitools.client.models.FileSchemaTestClass
import org.openapitools.client.models.HealthCheckResult
import org.openapitools.client.models.OuterComposite
import org.openapitools.client.models.Pet
import org.openapitools.client.models.User

import org.openapitools.client.infrastructure.*
import io.ktor.client.request.forms.formData
import kotlinx.serialization.UnstableDefault
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.features.json.serializer.KotlinxSerializer
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonConfiguration
import io.ktor.http.ParametersBuilder
import kotlinx.serialization.*
import kotlinx.serialization.internal.StringDescriptor

class FakeApi @UseExperimental(UnstableDefault::class) constructor(
    baseUrl: kotlin.String = "http://petstore.swagger.io:80/v2",
    httpClientEngine: HttpClientEngine? = null,
    serializer: KotlinxSerializer
) : ApiClient(baseUrl, httpClientEngine, serializer) {

    @UseExperimental(UnstableDefault::class)
    constructor(
        baseUrl: kotlin.String = "http://petstore.swagger.io:80/v2",
        httpClientEngine: HttpClientEngine? = null,
        jsonConfiguration: JsonConfiguration = JsonConfiguration.Default
    ) : this(baseUrl, httpClientEngine, KotlinxSerializer(Json(jsonConfiguration)))

    /**
     * Health check endpoint
     * 
     * @return HealthCheckResult
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun fakeHealthGet(): HttpResponse<HealthCheckResult> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fake/health",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * test http signature authentication
     * 
     * @param pet Pet object that needs to be added to the store 
     * @param query1 query parameter (optional)
     * @param header1 header parameter (optional)
     * @return void
     */
    suspend fun fakeHttpSignatureTest(pet: Pet, query1: kotlin.String?, header1: kotlin.String?): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("http_signature_test")

        val localVariableBody = pet

        val localVariableQuery = mutableMapOf<String, List<String>>()
        query1?.apply { localVariableQuery["query_1"] = listOf("$query1") }

        val localVariableHeaders = mutableMapOf<String, String>()
        header1?.apply { localVariableHeaders["header_1"] = this.toString() }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fake/http-signature-test",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 
     * Test serialization of outer boolean types
     * @param body Input boolean as post body (optional)
     * @return kotlin.Boolean
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun fakeOuterBooleanSerialize(body: kotlin.Boolean?): HttpResponse<kotlin.Boolean> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake/outer/boolean",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 
     * Test serialization of object with outer number type
     * @param outerComposite Input composite as post body (optional)
     * @return OuterComposite
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun fakeOuterCompositeSerialize(outerComposite: OuterComposite?): HttpResponse<OuterComposite> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = outerComposite

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake/outer/composite",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 
     * Test serialization of outer number types
     * @param body Input number as post body (optional)
     * @return kotlin.Double
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun fakeOuterNumberSerialize(body: kotlin.Double?): HttpResponse<kotlin.Double> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake/outer/number",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 
     * Test serialization of outer string types
     * @param body Input string as post body (optional)
     * @return kotlin.String
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun fakeOuterStringSerialize(body: kotlin.String?): HttpResponse<kotlin.String> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = body

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake/outer/string",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 
     * For this test, the body for this request much reference a schema named &#x60;File&#x60;.
     * @param fileSchemaTestClass  
     * @return void
     */
    suspend fun testBodyWithFileSchema(fileSchemaTestClass: FileSchemaTestClass): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = fileSchemaTestClass

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/fake/body-with-file-schema",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * 
     * 
     * @param query  
     * @param user  
     * @return void
     */
    suspend fun testBodyWithQueryParams(query: kotlin.String, user: User): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = user

        val localVariableQuery = mutableMapOf<String, List<String>>()
        query?.apply { localVariableQuery["query"] = listOf("$query") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/fake/body-with-query-params",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * To test \&quot;client\&quot; model
     * To test \&quot;client\&quot; model
     * @param client client model 
     * @return Client
     */
    @Suppress("UNCHECKED_CAST")
    suspend fun testClientModel(client: Client): HttpResponse<Client> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = client

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PATCH,
            "/fake",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    /**
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
     * @param number None 
     * @param double None 
     * @param patternWithoutDelimiter None 
     * @param byte None 
     * @param integer None (optional)
     * @param int32 None (optional)
     * @param int64 None (optional)
     * @param float None (optional)
     * @param string None (optional)
     * @param binary None (optional)
     * @param date None (optional)
     * @param dateTime None (optional)
     * @param password None (optional)
     * @param paramCallback None (optional)
     * @return void
     */
    suspend fun testEndpointParameters(number: kotlin.Double, double: kotlin.Double, patternWithoutDelimiter: kotlin.String, byte: org.openapitools.client.infrastructure.Base64ByteArray, integer: kotlin.Int?, int32: kotlin.Int?, int64: kotlin.Long?, float: kotlin.Float?, string: kotlin.String?, binary: io.ktor.client.request.forms.InputProvider?, date: kotlin.String?, dateTime: kotlin.String?, password: kotlin.String?, paramCallback: kotlin.String?): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("http_basic_test")

        val localVariableBody = 
            ParametersBuilder().also {
                integer?.apply { it.append("integer", integer.toString()) }
                int32?.apply { it.append("int32", int32.toString()) }
                int64?.apply { it.append("int64", int64.toString()) }
                number?.apply { it.append("number", number.toString()) }
                float?.apply { it.append("float", float.toString()) }
                double?.apply { it.append("double", double.toString()) }
                string?.apply { it.append("string", string.toString()) }
                patternWithoutDelimiter?.apply { it.append("pattern_without_delimiter", patternWithoutDelimiter.toString()) }
                byte?.apply { it.append("byte", byte.toString()) }
                binary?.apply { it.append("binary", binary.toString()) }
                date?.apply { it.append("date", date.toString()) }
                dateTime?.apply { it.append("dateTime", dateTime.toString()) }
                password?.apply { it.append("password", password.toString()) }
                paramCallback?.apply { it.append("callback", paramCallback.toString()) }
            }.build()

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return urlEncodedFormRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * To test enum parameters
     * To test enum parameters
     * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
     * @param enumHeaderString Header parameter enum test (string) (optional, default to -efg)
     * @param enumQueryStringArray Query parameter enum test (string array) (optional)
     * @param enumQueryString Query parameter enum test (string) (optional, default to -efg)
     * @param enumQueryInteger Query parameter enum test (double) (optional)
     * @param enumQueryDouble Query parameter enum test (double) (optional)
     * @param enumFormStringArray Form parameter enum test (string array) (optional, default to $)
     * @param enumFormString Form parameter enum test (string) (optional, default to -efg)
     * @return void
     */
    suspend fun testEnumParameters(enumHeaderStringArray: kotlin.collections.List<kotlin.String>?, enumHeaderString: kotlin.String?, enumQueryStringArray: kotlin.collections.List<kotlin.String>?, enumQueryString: kotlin.String?, enumQueryInteger: kotlin.Int?, enumQueryDouble: kotlin.Double?, enumFormStringArray: kotlin.collections.List<kotlin.String>?, enumFormString: kotlin.String?): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            ParametersBuilder().also {
                enumFormStringArray?.apply { it.append("enum_form_string_array", enumFormStringArray.toString()) }
                enumFormString?.apply { it.append("enum_form_string", enumFormString.toString()) }
            }.build()

        val localVariableQuery = mutableMapOf<String, List<String>>()
        enumQueryStringArray?.apply { localVariableQuery["enum_query_string_array"] = toMultiValue(this, "multi") }
        enumQueryString?.apply { localVariableQuery["enum_query_string"] = listOf("$enumQueryString") }
        enumQueryInteger?.apply { localVariableQuery["enum_query_integer"] = listOf("$enumQueryInteger") }
        enumQueryDouble?.apply { localVariableQuery["enum_query_double"] = listOf("$enumQueryDouble") }

        val localVariableHeaders = mutableMapOf<String, String>()
        enumHeaderStringArray?.apply { localVariableHeaders["enum_header_string_array"] = this.joinToString(separator = collectionDelimiter("csv")) }
        enumHeaderString?.apply { localVariableHeaders["enum_header_string"] = this.toString() }

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fake",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return urlEncodedFormRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * Fake endpoint to test group parameters (optional)
     * Fake endpoint to test group parameters (optional)
     * @param requiredStringGroup Required String in group parameters 
     * @param requiredBooleanGroup Required Boolean in group parameters 
     * @param requiredInt64Group Required Integer in group parameters 
     * @param stringGroup String in group parameters (optional)
     * @param booleanGroup Boolean in group parameters (optional)
     * @param int64Group Integer in group parameters (optional)
     * @return void
     */
    suspend fun testGroupParameters(requiredStringGroup: kotlin.Int, requiredBooleanGroup: kotlin.Boolean, requiredInt64Group: kotlin.Long, stringGroup: kotlin.Int?, booleanGroup: kotlin.Boolean?, int64Group: kotlin.Long?): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>("bearer_test")

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        requiredStringGroup?.apply { localVariableQuery["required_string_group"] = listOf("$requiredStringGroup") }
        requiredInt64Group?.apply { localVariableQuery["required_int64_group"] = listOf("$requiredInt64Group") }
        stringGroup?.apply { localVariableQuery["string_group"] = listOf("$stringGroup") }
        int64Group?.apply { localVariableQuery["int64_group"] = listOf("$int64Group") }

        val localVariableHeaders = mutableMapOf<String, String>()
        requiredBooleanGroup?.apply { localVariableHeaders["required_boolean_group"] = this.toString() }
        booleanGroup?.apply { localVariableHeaders["boolean_group"] = this.toString() }

        val localVariableConfig = RequestConfig(
            RequestMethod.DELETE,
            "/fake",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * test inline additionalProperties
     * 
     * @param requestBody request body 
     * @return void
     */
    suspend fun testInlineAdditionalProperties(requestBody: kotlin.collections.Map<kotlin.String, kotlin.String>): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = TestInlineAdditionalPropertiesRequest(requestBody)

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.POST,
            "/fake/inline-additionalProperties",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return jsonRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }

    @Serializable
    private class TestInlineAdditionalPropertiesRequest(val value: Map<kotlin.String, kotlin.String>) {
        @Serializer(TestInlineAdditionalPropertiesRequest::class)
        companion object : KSerializer<TestInlineAdditionalPropertiesRequest> {
            private val serializer: KSerializer<Map<kotlin.String, kotlin.String>> = (kotlin.String.serializer() to kotlin.String.serializer()).map
                override val descriptor = StringDescriptor.withName("TestInlineAdditionalPropertiesRequest")
                override fun serialize(encoder: Encoder, obj: TestInlineAdditionalPropertiesRequest) = serializer.serialize(encoder, obj.value)
                override fun deserialize(decoder: Decoder) = TestInlineAdditionalPropertiesRequest(serializer.deserialize(decoder))
        }
    }

    /**
     * test json serialization of form data
     * 
     * @param param field1 
     * @param param2 field2 
     * @return void
     */
    suspend fun testJsonFormData(param: kotlin.String, param2: kotlin.String): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            ParametersBuilder().also {
                param?.apply { it.append("param", param.toString()) }
                param2?.apply { it.append("param2", param2.toString()) }
            }.build()

        val localVariableQuery = mutableMapOf<String, List<String>>()

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.GET,
            "/fake/jsonFormData",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return urlEncodedFormRequest(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }


    /**
     * 
     * To test the collection format in query parameters
     * @param pipe  
     * @param ioutil  
     * @param http  
     * @param url  
     * @param context  
     * @return void
     */
    suspend fun testQueryParameterCollectionFormat(pipe: kotlin.collections.List<kotlin.String>, ioutil: kotlin.collections.List<kotlin.String>, http: kotlin.collections.List<kotlin.String>, url: kotlin.collections.List<kotlin.String>, context: kotlin.collections.List<kotlin.String>): HttpResponse<Unit> {

        val localVariableAuthNames = listOf<String>()

        val localVariableBody = 
            io.ktor.client.utils.EmptyContent

        val localVariableQuery = mutableMapOf<String, List<String>>()
        pipe?.apply { localVariableQuery["pipe"] = toMultiValue(this, "multi") }
        ioutil?.apply { localVariableQuery["ioutil"] = toMultiValue(this, "csv") }
        http?.apply { localVariableQuery["http"] = toMultiValue(this, "ssv") }
        url?.apply { localVariableQuery["url"] = toMultiValue(this, "csv") }
        context?.apply { localVariableQuery["context"] = toMultiValue(this, "multi") }

        val localVariableHeaders = mutableMapOf<String, String>()

        val localVariableConfig = RequestConfig(
            RequestMethod.PUT,
            "/fake/test-query-parameters",
            query = localVariableQuery,
            headers = localVariableHeaders
        )

        return request(
            localVariableConfig,
            localVariableBody,
            localVariableAuthNames
        ).wrap()
    }



    companion object {
        internal fun setMappers(serializer: KotlinxSerializer) {
            
            
            
            
            
            
            
            
            serializer.setMapper(TestInlineAdditionalPropertiesRequest::class, TestInlineAdditionalPropertiesRequest.serializer())
        }
    }
}
