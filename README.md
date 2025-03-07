# SPM-onlineShopping
The work for SPM



# Authentication

# 接口

## GET 获取首页数据

GET /home

获取首页展示所需数据，如轮播图、推荐产品等。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回首页数据 | [ApiResponse](#schemaapiresponse) |

## GET 商品搜索

GET /product/search

根据关键字或筛选条件查询商品列表，支持分页和排序。

### 请求参数

| 名称    | 位置  | 类型    | 必选 | 说明         |
| ------- | ----- | ------- | ---- | ------------ |
| keyword | query | string  | 否   | 搜索关键字   |
| page    | query | integer | 否   | 页码         |
| limit   | query | integer | 否   | 每页显示数量 |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回搜索结果 | [ApiResponse](#schemaapiresponse) |

## GET 商品详情页

GET /product/{id}

获取单个商品的详细信息，包括图片、描述、规格、价格、库存等。

### 请求参数

| 名称 | 位置 | 类型    | 必选 | 说明   |
| ---- | ---- | ------- | ---- | ------ |
| id   | path | integer | 是   | 商品ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回商品详情 | [ApiResponse](#schemaapiresponse) |

## GET 购物车商品总数量

GET /cart/quantity

获取当前购物车中商品的总数量，用于展示购物车角标。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                   | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回购物车商品数量 | [ApiResponse](#schemaapiresponse) |

## GET 商品保障服务

GET /product/protection

返回商品相关的保障服务信息，如售后保障、品质保证等。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                 | 数据模型                          |
| ------ | ------------------------------------------------------- | -------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回保障服务信息 | [ApiResponse](#schemaapiresponse) |

## GET 获取商品评论

GET /product/{id}/comments

获取指定商品的评论内容。

### 请求参数

| 名称 | 位置 | 类型    | 必选 | 说明   |
| ---- | ---- | ------- | ---- | ------ |
| id   | path | integer | 是   | 商品ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回商品评论 | [ApiResponse](#schemaapiresponse) |

## GET 获取商品评价总数

GET /product/{id}/comments/count

返回某个商品所有评价的数量，便于统计和分页显示。

### 请求参数

| 名称 | 位置 | 类型    | 必选 | 说明   |
| ---- | ---- | ------- | ---- | ------ |
| id   | path | integer | 是   | 商品ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回评价总数 | [ApiResponse](#schemaapiresponse) |

## GET 商品评价列表

GET /product/{id}/reviews

分页获取商品的评价列表，包含文字、图片等多媒体信息。

### 请求参数

| 名称  | 位置  | 类型    | 必选 | 说明         |
| ----- | ----- | ------- | ---- | ------------ |
| id    | path  | integer | 是   | 商品ID       |
| page  | query | integer | 否   | 页码         |
| limit | query | integer | 否   | 每页显示数量 |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                 | 数据模型                          |
| ------ | ------------------------------------------------------- | -------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回商品评价列表 | [ApiResponse](#schemaapiresponse) |

## POST 添加商品到购物车

POST /cart

将选定的商品加入购物车，可包含商品规格和数量等信息。

> Body 请求参数

```json
""
```

### 请求参数

| 名称        | 位置 | 类型    | 必选 | 说明     |
| ----------- | ---- | ------- | ---- | -------- |
| body        | body | object  | 否   | none     |
| » productId | body | integer | 是   | 商品ID   |
| » quantity  | body | integer | 是   | 数量     |
| » spec      | body | string  | 否   | 商品规格 |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                 | 数据模型                          |
| ------ | ------------------------------------------------------- | -------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功添加商品到购物车 | [ApiResponse](#schemaapiresponse) |

## GET 购物车商品列表

GET /cart

获取当前用户购物车中所有商品的详细列表信息。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                   | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回购物车商品列表 | [ApiResponse](#schemaapiresponse) |

## GET 获取图形验证码

GET /captcha

返回用于防止恶意请求的图形验证码，一般用于登录或注册前的验证。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明               | 数据模型                          |
| ------ | ------------------------------------------------------- | ------------------ | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回图形验证码 | [ApiResponse](#schemaapiresponse) |

## POST 登录-获取短信验证码

POST /auth/sms-code

用户请求短信验证码，用于登录或身份验证（测试环境验证码固定为246810）。

> Body 请求参数

```json
""
```

### 请求参数

| 名称    | 位置 | 类型   | 必选 | 说明     |
| ------- | ---- | ------ | ---- | -------- |
| body    | body | object | 否   | none     |
| » phone | body | string | 是   | 手机号码 |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明               | 数据模型                          |
| ------ | ------------------------------------------------------- | ------------------ | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功发送短信验证码 | [ApiResponse](#schemaapiresponse) |

## POST 手机验证码登录

POST /auth/login

用户使用短信验证码进行登录，图形验证码可选传递。

> Body 请求参数

```json
""
```

### 请求参数

| 名称      | 位置 | 类型   | 必选 | 说明               |
| --------- | ---- | ------ | ---- | ------------------ |
| body      | body | object | 否   | none               |
| » phone   | body | string | 是   | 手机号码           |
| » smsCode | body | string | 是   | 短信验证码         |
| » captcha | body | string | 否   | 图形验证码（可选） |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                                | 数据模型                          |
| ------ | ------------------------------------------------------- | ----------------------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 登录成功，返回用户 token 及相关信息 | [ApiResponse](#schemaapiresponse) |

## POST 购物车商品更新

POST /cart/update

更新购物车中某个商品的数量或其他属性。

> Body 请求参数

```json
""
```

### 请求参数

| 名称         | 位置 | 类型    | 必选 | 说明         |
| ------------ | ---- | ------- | ---- | ------------ |
| body         | body | object  | 否   | none         |
| » cartItemId | body | integer | 是   | 购物车项ID   |
| » quantity   | body | integer | 是   | 更新后的数量 |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明               | 数据模型                          |
| ------ | ------------------------------------------------------- | ------------------ | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功更新购物车商品 | [ApiResponse](#schemaapiresponse) |

## POST 删除购物车商品

POST /cart/delete

从购物车中移除指定的商品。

> Body 请求参数

```json
""
```

### 请求参数

| 名称         | 位置 | 类型    | 必选 | 说明       |
| ------------ | ---- | ------- | ---- | ---------- |
| body         | body | object  | 否   | none       |
| » cartItemId | body | integer | 是   | 购物车项ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                   | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功删除购物车中的商品 | [ApiResponse](#schemaapiresponse) |

## GET 订单结算

GET /order/checkout

获取订单结算页所需数据，包括商品价格、运费、优惠信息等。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回结算信息 | [ApiResponse](#schemaapiresponse) |

## GET 收货地址列表

GET /address

获取当前用户保存的所有收货地址。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                 | 数据模型                          |
| ------ | ------------------------------------------------------- | -------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回收货地址列表 | [ApiResponse](#schemaapiresponse) |

## POST 添加收货地址

POST /address

用户新增收货地址，传入详细地址、联系人及联系方式等信息。

> Body 请求参数

```json
""
```

### 请求参数

| 名称        | 位置 | 类型   | 必选 | 说明       |
| ----------- | ---- | ------ | ---- | ---------- |
| body        | body | object | 否   | none       |
| » recipient | body | string | 是   | 收件人姓名 |
| » phone     | body | string | 是   | 联系电话   |
| » address   | body | string | 是   | 详细地址   |
| » province  | body | string | 是   | none       |
| » city      | body | string | 是   | none       |
| » district  | body | string | 是   | none       |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功添加收货地址 | [ApiResponse](#schemaapiresponse) |

## GET 默认收货地址ID

GET /address/default

获取当前用户设置的默认收货地址的 ID。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明               | 数据模型                          |
| ------ | ------------------------------------------------------- | ------------------ | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回默认地址ID | [ApiResponse](#schemaapiresponse) |

## POST 设置默认地址

POST /address/default

将指定的收货地址设置为默认地址。

> Body 请求参数

```json
""
```

### 请求参数

| 名称        | 位置 | 类型    | 必选 | 说明       |
| ----------- | ---- | ------- | ---- | ---------- |
| body        | body | object  | 否   | none       |
| » addressId | body | integer | 是   | 收货地址ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                 | 数据模型                          |
| ------ | ------------------------------------------------------- | -------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功设置默认收货地址 | [ApiResponse](#schemaapiresponse) |

## GET 获取省市区-添加地址

GET /address/regions

获取省、市、区等地理数据，便于用户在添加收货地址时选择区域。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回区域数据 | [ApiResponse](#schemaapiresponse) |

## POST 删除收货地址

POST /address/delete

删除指定的收货地址记录。

> Body 请求参数

```json
""
```

### 请求参数

| 名称        | 位置 | 类型    | 必选 | 说明       |
| ----------- | ---- | ------- | ---- | ---------- |
| body        | body | object  | 否   | none       |
| » addressId | body | integer | 是   | 收货地址ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功删除收货地址 | [ApiResponse](#schemaapiresponse) |

## GET 获取收货地址详情

GET /address/{id}

获取单个收货地址的详细信息，用于查看或编辑。

### 请求参数

| 名称 | 位置 | 类型    | 必选 | 说明       |
| ---- | ---- | ------- | ---- | ---------- |
| id   | path | integer | 是   | 收货地址ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回地址详情 | [ApiResponse](#schemaapiresponse) |

## POST 编辑收货地址

POST /address/update

修改已保存的收货地址信息。

> Body 请求参数

```json
""
```

### 请求参数

| 名称        | 位置 | 类型    | 必选 | 说明       |
| ----------- | ---- | ------- | ---- | ---------- |
| body        | body | object  | 否   | none       |
| » addressId | body | integer | 是   | 收货地址ID |
| » recipient | body | string  | 否   | 收件人姓名 |
| » phone     | body | string  | 否   | 联系电话   |
| » address   | body | string  | 否   | 详细地址   |
| » province  | body | string  | 否   | none       |
| » city      | body | string  | 否   | none       |
| » district  | body | string  | 否   | none       |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功更新收货地址 | [ApiResponse](#schemaapiresponse) |

## POST 提交订单

POST /order

用户确认订单后提交订单信息，生成订单记录。

> Body 请求参数

```json
""
```

### 请求参数

| 名称            | 位置 | 类型     | 必选 | 说明         |
| --------------- | ---- | -------- | ---- | ------------ |
| body            | body | object   | 否   | none         |
| » addressId     | body | integer  | 是   | 收货地址ID   |
| » paymentMethod | body | string   | 是   | 支付方式     |
| » items         | body | [object] | 是   | 订单商品列表 |
| »» productId    | body | integer  | 是   | none         |
| »» quantity     | body | integer  | 是   | none         |
| »» spec         | body | string   | 否   | none         |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明         | 数据模型                          |
| ------ | ------------------------------------------------------- | ------------ | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功提交订单 | [ApiResponse](#schemaapiresponse) |

## GET 商品全部分类

GET /product/categories

获取商城中所有商品分类数据，便于前端展示分类导航。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                 | 数据模型                          |
| ------ | ------------------------------------------------------- | -------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回商品分类数据 | [ApiResponse](#schemaapiresponse) |

## GET 我的-获取用户信息

GET /user

获取当前登录用户的个人基本信息，如昵称、头像、联系方式等。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回用户信息 | [ApiResponse](#schemaapiresponse) |

## GET 我的-余额，积分，优惠券

GET /user/account

返回用户账户的余额、积分以及优惠券信息。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回账户信息 | [ApiResponse](#schemaapiresponse) |

## GET 我的-商品状态数量

GET /order/status-count

根据订单状态（全部、待支付、待收货、待发货）统计用户订单数量。

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                     | 数据模型                          |
| ------ | ------------------------------------------------------- | ------------------------ | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回订单状态统计数据 | [ApiResponse](#schemaapiresponse) |

## GET 我的-订单

GET /orders

获取当前用户的所有订单列表，可根据订单状态进行筛选。

### 请求参数

| 名称   | 位置  | 类型   | 必选 | 说明                                       |
| ------ | ----- | ------ | ---- | ------------------------------------------ |
| status | query | string | 否   | 订单状态筛选条件（例如：待支付、待收货等） |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回订单列表 | [ApiResponse](#schemaapiresponse) |

## GET 我的-订单详情

GET /order/{id}

查看单个订单的详细信息，包括商品列表、物流、支付等详情。

### 请求参数

| 名称 | 位置 | 类型    | 必选 | 说明   |
| ---- | ---- | ------- | ---- | ------ |
| id   | path | integer | 是   | 订单ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回订单详情 | [ApiResponse](#schemaapiresponse) |

## POST 我的-取消订单

POST /order/cancel

用户取消订单，在允许取消的状态下撤销订单。

> Body 请求参数

```json
""
```

### 请求参数

| 名称      | 位置 | 类型    | 必选 | 说明   |
| --------- | ---- | ------- | ---- | ------ |
| body      | body | object  | 否   | none   |
| » orderId | body | integer | 是   | 订单ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明         | 数据模型                          |
| ------ | ------------------------------------------------------- | ------------ | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功取消订单 | [ApiResponse](#schemaapiresponse) |

## GET 我的-订单支付

GET /order/payment

获取订单支付信息，包括支付方式、支付金额等。

### 请求参数

| 名称    | 位置  | 类型    | 必选 | 说明   |
| ------- | ----- | ------- | ---- | ------ |
| orderId | query | integer | 是   | 订单ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回支付信息 | [ApiResponse](#schemaapiresponse) |

## POST 我的-订单确认收货

POST /order/confirm

用户确认收货，完成订单流程。

> Body 请求参数

```json
""
```

### 请求参数

| 名称      | 位置 | 类型    | 必选 | 说明   |
| --------- | ---- | ------- | ---- | ------ |
| body      | body | object  | 否   | none   |
| » orderId | body | integer | 是   | 订单ID |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明         | 数据模型                          |
| ------ | ------------------------------------------------------- | ------------ | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功确认收货 | [ApiResponse](#schemaapiresponse) |

## GET 我的-订单评价商品列表

GET /order/review-list

列出用户待评价的商品列表，方便进行评价操作。

### 请求参数

| 名称    | 位置  | 类型    | 必选 | 说明                 |
| ------- | ----- | ------- | ---- | -------------------- |
| orderId | query | integer | 否   | 可选的订单ID筛选条件 |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明                   | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功返回待评价商品列表 | [ApiResponse](#schemaapiresponse) |

## POST 上传图片

POST /upload

用户上传图片接口，用于商品评价等场景，采用 multipart/form-data 格式。

> Body 请求参数

```yaml
file: ""

```

### 请求参数

| 名称   | 位置 | 类型           | 必选 | 说明 |
| ------ | ---- | -------------- | ---- | ---- |
| body   | body | object         | 否   | none |
| » file | body | string(binary) | 是   | none |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明         | 数据模型                          |
| ------ | ------------------------------------------------------- | ------------ | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功上传图片 | [ApiResponse](#schemaapiresponse) |

## POST 我的-提交商品评价

POST /order/review

用户对订单中的商品提交评价，支持文字及图片上传。

> Body 请求参数

```json
""
```

### 请求参数

| 名称        | 位置 | 类型     | 必选 | 说明             |
| ----------- | ---- | -------- | ---- | ---------------- |
| body        | body | object   | 否   | none             |
| » orderId   | body | integer  | 是   | 订单ID           |
| » productId | body | integer  | 是   | 商品ID           |
| » rating    | body | integer  | 是   | 评分             |
| » comment   | body | string   | 否   | 评价内容         |
| » images    | body | [string] | 否   | 上传图片地址列表 |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明         | 数据模型                          |
| ------ | ------------------------------------------------------- | ------------ | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功提交评价 | [ApiResponse](#schemaapiresponse) |

## POST 我的-申请售后

POST /order/after-sale

用户对已购买商品提出售后申请，如退换货、维修等。

> Body 请求参数

```json
""
```

### 请求参数

| 名称        | 位置 | 类型    | 必选 | 说明         |
| ----------- | ---- | ------- | ---- | ------------ |
| body        | body | object  | 否   | none         |
| » orderId   | body | integer | 是   | 订单ID       |
| » productId | body | integer | 是   | 商品ID       |
| » reason    | body | string  | 是   | 售后申请原因 |

> 返回示例

> 200 Response

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}
```

### 返回结果

| 状态码 | 状态码含义                                              | 说明             | 数据模型                          |
| ------ | ------------------------------------------------------- | ---------------- | --------------------------------- |
| 200    | [OK](https://tools.ietf.org/html/rfc7231#section-6.3.1) | 成功提交售后申请 | [ApiResponse](#schemaapiresponse) |

# 数据模型

<h2 id="tocS_ApiResponse">ApiResponse</h2>

<a id="schemaapiresponse"></a>
<a id="schema_ApiResponse"></a>
<a id="tocSapiresponse"></a>
<a id="tocsapiresponse"></a>

```json
{
  "code": 0,
  "message": "string",
  "data": {}
}

```

### 属性

| 名称    | 类型    | 必选  | 约束 | 中文名 | 说明                                   |
| ------- | ------- | ----- | ---- | ------ | -------------------------------------- |
| code    | integer | false | none |        | 状态码（例如：0 表示成功）             |
| message | string  | false | none |        | 提示信息                               |
| data    | object  | false | none |        | 返回的数据内容（具体结构根据接口而定） |

