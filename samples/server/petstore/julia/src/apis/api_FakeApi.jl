# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


function uuid_default_value_read(handler)
    function uuid_default_value_read_handler(req::HTTP.Request)
        openapi_params = Dict{String,Any}()
        headers = Dict{String,String}(HTTP.headers(req))
        openapi_params["uuid_parameter"] = OpenAPI.Servers.to_param(String, headers, "uuid_parameter", required=true, )
        req.context[:openapi_params] = openapi_params

        return handler(req)
    end
end

function uuid_default_value_validate(handler)
    function uuid_default_value_validate_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        
        return handler(req)
    end
end

function uuid_default_value_invoke(impl; post_invoke=nothing)
    function uuid_default_value_invoke_handler(req::HTTP.Request)
        openapi_params = req.context[:openapi_params]
        ret = impl.uuid_default_value(req::HTTP.Request, openapi_params["uuid_parameter"];)
        resp = OpenAPI.Servers.server_response(ret)
        return (post_invoke === nothing) ? resp : post_invoke(req, resp)
    end
end


function registerFakeApi(router::HTTP.Router, impl; path_prefix::String="", optional_middlewares...)
    HTTP.register!(router, "GET", path_prefix * "/fake/uuid_default_value_test", OpenAPI.Servers.middleware(impl, uuid_default_value_read, uuid_default_value_validate, uuid_default_value_invoke; optional_middlewares...))
    return router
end
