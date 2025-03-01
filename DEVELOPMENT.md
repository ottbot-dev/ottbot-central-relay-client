## Generate commands

1. Download https://central-relay.ottbot.dev/api-docs.yaml
2. update [openapi.yaml](api/openapi.yaml) file
3. Run shell command in dev container
    ```shell
    npx openapi-generator-cli generate --generator-key central-relay-api
    ```
4. Check `pom.xml` doesnt change `<version>` string
5. Commit to branch and open pr, actions will deploy when merged to main

# ! Dont commit to main !

---

## Reference

* https://github.com/OpenAPITools/openapi-generator/blob/master/docs/customization.md

```shell
sudo npx openapi-generator-cli config-help --generator-name java
```


