// <auto-generated>
/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using OpenAPIClientUtils = Org.OpenAPITools.Client.ClientUtils;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ShapeInterface
    /// </summary>
    public partial class ShapeInterface : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ShapeInterface" /> class.
        /// </summary>
        /// <param name="shapeType">shapeType</param>
        [JsonConstructor]
        public ShapeInterface(string shapeType)
        {
            ShapeType = shapeType;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Gets or Sets ShapeType
        /// </summary>
        [JsonPropertyName("shapeType")]
        public string ShapeType { get; set; }

        /// <summary>
        /// Gets or Sets additional properties
        /// </summary>
        [JsonExtensionData]
        public Dictionary<string, JsonElement> AdditionalProperties { get; } = new Dictionary<string, JsonElement>();

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ShapeInterface {\n");
            sb.Append("  ShapeType: ").Append(ShapeType).Append("\n");
            sb.Append("  AdditionalProperties: ").Append(AdditionalProperties).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="ShapeInterface" />
    /// </summary>
    public class ShapeInterfaceJsonConverter : JsonConverter<ShapeInterface>
    {
        /// <summary>
        /// Deserializes json to <see cref="ShapeInterface" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override ShapeInterface Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            string? shapeType = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        case "shapeType":
                            shapeType = utf8JsonReader.GetString();
                            break;
                        default:
                            break;
                    }
                }
            }

            if (shapeType == null)
                throw new ArgumentNullException(nameof(shapeType), "Property is required for class ShapeInterface.");

            return new ShapeInterface(shapeType);
        }

        /// <summary>
        /// Serializes a <see cref="ShapeInterface" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="shapeInterface"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, ShapeInterface shapeInterface, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            WriteProperties(ref writer, shapeInterface, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="ShapeInterface" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="shapeInterface"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(ref Utf8JsonWriter writer, ShapeInterface shapeInterface, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteString("shapeType", shapeInterface.ShapeType);
        }
    }
}
